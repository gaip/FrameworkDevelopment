package bootcamp.test.filereaders.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriter {

	public void write() {
		JSONObject obj1 = new JSONObject();
		obj1.put("username", "uname1");
		obj1.put("password", "pass1");

		JSONObject obj2 = new JSONObject();
		obj2.put("username", "uname2");
		obj2.put("password", "pass2");

		JSONArray array = new JSONArray();
		array.add(obj1);
		array.add(obj2);

		try {
			FileWriter writer = new FileWriter(new File("src/test/resources/test/creds.json"));
			writer.write(array.toJSONString());
			writer.flush();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JSONWriter jw = new JSONWriter();
		jw.write();
	}
}
