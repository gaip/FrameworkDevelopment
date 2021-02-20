package bootcamp.test.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Confirmation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to launch a page
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().dismiss();
	}
}
