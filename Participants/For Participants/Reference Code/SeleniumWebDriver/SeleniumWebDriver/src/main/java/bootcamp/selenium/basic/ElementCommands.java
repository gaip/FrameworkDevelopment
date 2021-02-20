package bootcamp.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementCommands {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to launch a page
		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.xpath("//*[@name='q'][2]"));
		searchBox.clear();
		searchBox.sendKeys("Test");
		searchBox.clear();

		driver.findElement(By.linkText("Gmail")).click();

	}
}
