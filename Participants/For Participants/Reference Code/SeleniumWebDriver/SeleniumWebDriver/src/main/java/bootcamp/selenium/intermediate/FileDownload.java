package bootcamp.selenium.intermediate;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// to set behaviour of the browser
		ChromeOptions option = new ChromeOptions();

		// behaviour settings
		Map<String, Object> pref = new HashMap<String, Object>();
		pref.put("download.prompt_for_download", false);
		pref.put("download.default_directory", "/Users/kunalashar");

		// add settings
		option.setExperimentalOption("prefs", pref);

		WebDriver driver = new ChromeDriver(option);

		// maximize browser
		driver.manage().window().maximize();

		// to launch a page
		driver.get("https://demoqa.com/upload-download");

		driver.findElement(By.id("downloadButton")).click();
	}
}
