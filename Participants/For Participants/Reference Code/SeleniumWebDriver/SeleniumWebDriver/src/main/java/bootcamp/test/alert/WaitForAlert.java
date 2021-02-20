package bootcamp.test.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlert {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to launch a page
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("timerAlertButton")).click();

		boolean isAlertPresent = false;
		int i = 0;

		while (!isAlertPresent) {
			try {
				i++;
				driver.switchTo().alert();
				isAlertPresent = true;
			} catch (NoAlertPresentException e) {
				System.out.println("Alert not present on page. Try " + i);
			}
		}
	}
}
