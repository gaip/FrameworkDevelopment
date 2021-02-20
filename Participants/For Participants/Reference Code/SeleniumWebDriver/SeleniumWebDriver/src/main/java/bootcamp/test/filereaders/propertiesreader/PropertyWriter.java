package bootcamp.test.filereaders.propertiesreader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyWriter {

	public void write() {
		Properties prop = new Properties();
		prop.put("name", "test");
		prop.put("email", "test@gmail.com");

		try {
			prop.store(new FileWriter("src/test/resources/test/write.properties"), "Created new file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PropertyWriter pr = new PropertyWriter();
		pr.write();
	}
}
