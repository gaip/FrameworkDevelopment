package bootcamp.test.filereaders.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONReader {

	public void read() {

		FileReader reader = null;
		try {
			reader = new FileReader("src/test/resources/test/userDirectory.json");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// store entire json
		JsonElement jsonElement = JsonParser.parseReader(reader);

		// fetch json array
		JsonArray jsonArray = jsonElement.getAsJsonArray();

		// iterate on each element and print
		for (Object object : jsonArray) {
			JsonObject jsonObject = (JsonObject) object;
			System.out.println(jsonObject.get("id"));
			System.out.println(jsonObject.get("first_name"));
			System.out.println(jsonObject.get("last_name"));
			System.out.println(jsonObject.get("email"));
			System.out.println(jsonObject.get("address"));
			System.out.println("----------------------------------");
		}
	}

	public static void main(String[] args) {
		JSONReader jr = new JSONReader();
		jr.read();
	}
}
