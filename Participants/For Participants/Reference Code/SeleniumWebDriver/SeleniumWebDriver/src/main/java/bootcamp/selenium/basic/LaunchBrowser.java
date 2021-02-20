package bootcamp.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to launch a page
		driver.get("https://www.google.com/");
	}

	public static WebDriver launch(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();

		// maximize browser
		driver.manage().window().maximize();

		// to launch a page
		driver.get(url);

		return driver;
	}
}
