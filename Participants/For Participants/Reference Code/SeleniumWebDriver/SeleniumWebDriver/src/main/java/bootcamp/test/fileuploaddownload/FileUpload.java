package bootcamp.test.fileuploaddownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class FileUpload {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/upload-download");

		WebElement upload = driver.findElement(By.id("uploadFile"));
		upload.sendKeys("/Users/kunalashar/automation_bootcamp/SeleniumWebDriver/src/main/resources/pirate.png");
	}
}
