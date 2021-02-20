package bootcamp.test.waits;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTillPageLoad {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.thetesttribe.com/");
		waitForPageLoad(driver);

		driver.quit();

	}

	public static void waitForPageLoad(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
	}
}
