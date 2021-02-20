package bootcamp.selenium.advance.file.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonReader {

	public void read() {

		FileReader reader = null;
		try {
			reader = new FileReader("src/test/resources/testng/user.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		JsonElement element = JsonParser.parseReader(reader);

		JsonArray array = element.getAsJsonArray();

		for (Object o : array) {
			JsonObject jsonObject = (JsonObject) o;
			System.out.println(jsonObject.get("id"));
			System.out.println(jsonObject.get("first_name"));
		}
	}

	public static void main(String[] args) {
		JsonReader reader = new JsonReader();
		reader.read();
	}
}
