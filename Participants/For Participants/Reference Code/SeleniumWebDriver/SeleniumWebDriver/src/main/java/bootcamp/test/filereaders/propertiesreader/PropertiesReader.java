package bootcamp.test.filereaders.propertiesreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	String baseFilePath = "src/test/resources/test/config.properties";

	Properties properties = new Properties();

	public void read() {
		File file = new File(baseFilePath);

		try {
			// read file
			FileReader reader = new FileReader(file);

			// load to properties
			properties.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String propertyKey) {
		return properties.getProperty(propertyKey);
	}

	public static void main(String[] args) {
		PropertiesReader pr = new PropertiesReader();
		pr.read();

		System.out.println(pr.getProperty("browserName"));
	}
}
