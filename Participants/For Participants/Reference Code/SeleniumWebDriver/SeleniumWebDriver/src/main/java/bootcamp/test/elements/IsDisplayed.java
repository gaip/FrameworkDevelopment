package bootcamp.test.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to launch a page
		driver.get("file:///Users/kunalashar/automation_bootcamp/SeleniumWebDriver/src/main/resources/hidden.html");

		System.out.println(driver.findElement(By.id("lname")).isDisplayed());

		driver.quit();
	}
}
