package bootcamp.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class DynamicPopup {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/alerts");

		driver.findElement(By.id("timerAlertButton")).click();

		boolean isAlertPresent = true;
		int i = 0;

		while (isAlertPresent) {
			try {
				i++;
				driver.switchTo().alert().accept();
				isAlertPresent = false;
			} catch (NoAlertPresentException e) {
				System.out.println("Alert not present " + i);
			}
		}
	}
}
