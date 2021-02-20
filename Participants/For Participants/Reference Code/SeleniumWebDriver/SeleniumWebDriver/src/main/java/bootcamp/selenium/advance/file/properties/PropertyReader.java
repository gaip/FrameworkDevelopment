package bootcamp.selenium.advance.file.properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	private String properties_file_path = "src/test/resources/testng/config.properties";

	Properties properties = new Properties();

	public PropertyReader() {
		read();
	}

	private void read() {
		File file = new File(properties_file_path);

		try {
			FileReader reader = new FileReader(file);

			properties.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// read env name
		String env_name = getProperty("environment_name");
	}

	public String getProperty(String propertyKey) {
		return properties.getProperty(propertyKey);
	}

	public static void main(String[] args) {
		PropertyReader pr = new PropertyReader();
		String value = pr.getProperty("browserName");
		System.out.println(value);
	}
}
