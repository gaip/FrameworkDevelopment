package bootcamp.test.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prompt {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to launch a page
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("promtButton")).click();

		Alert prompt = driver.switchTo().alert();
		System.out.println(prompt.getText()); // Please enter your name
		prompt.sendKeys("Hello");
		prompt.accept();
		
	}
}
