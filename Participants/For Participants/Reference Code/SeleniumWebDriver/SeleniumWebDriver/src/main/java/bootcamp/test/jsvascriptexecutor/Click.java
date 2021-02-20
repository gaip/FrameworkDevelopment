package bootcamp.test.jsvascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to launch a page
		driver.get("https://demoqa.com/alerts");
		
		WebElement element = driver.findElement(By.id("promtButton"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	}
}
