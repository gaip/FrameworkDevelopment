package bootcamp.selenium.advance.file.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonReader_Reem {

	public static List<JsonObject> read() {

		FileReader reader = null;
		try {
			reader = new FileReader("src/test/resources/testng/reem.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		JsonElement element = JsonParser.parseReader(reader);

		JsonArray array = element.getAsJsonArray();

		List<JsonObject> objectList = new ArrayList<JsonObject>();

		for (Object o : array) {
			JsonObject jsonObject = (JsonObject) o;
			objectList.add(jsonObject);
		}
		
		return objectList;
	}

	public static void main(String[] args) {
		JsonReader_Reem reader = new JsonReader_Reem();
		reader.read();
	}
}
