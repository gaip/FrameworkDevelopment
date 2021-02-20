package bootcamp.test.fileuploaddownload;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadChrome {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		Map<String, Object> preference = new HashMap<String, Object>();
		preference.put("download.prompt_for_download", false);
		preference.put("download.default_directory", "/Users/kunalashar");
		options.setExperimentalOption("prefs", preference);

		WebDriver driver = new ChromeDriver(options);

		// to launch a page
		driver.get("https://demoqa.com/upload-download");

		driver.findElement(By.id("downloadButton")).click();

//		FirefoxProfile profile=new FirefoxProfile();
//		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
//
//		WebDriver driver=new FirefoxDriver(profile);
	}
}
