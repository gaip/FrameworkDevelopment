package bootcamp.test.fileuploaddownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadFIrefox {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.dir", "/Users/kunalashar");
		profile.setPreference("browser.download.folderList", 2);

		// Set Preference to not show file download confirmation dialogue using MIME
		// types Of different file extension types.
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");

		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);

		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://demoqa.com/upload-download");

		driver.findElement(By.id("downloadButton")).click();
	}

}
