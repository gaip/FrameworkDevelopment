package automation.bootcamp.nop.file.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private String properties_file_path = "src/main/resources/config.properties";

	static Properties properties = new Properties();

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
	}

	public static String getProperty(String propertyKey) {
		return properties.getProperty(propertyKey);
	}
	
	public static void main(String[] args) {
		PropertyReader pr = new PropertyReader();
		String url = pr.getProperty("baseUrl");
		System.out.println(url);
		
		
	}

}
