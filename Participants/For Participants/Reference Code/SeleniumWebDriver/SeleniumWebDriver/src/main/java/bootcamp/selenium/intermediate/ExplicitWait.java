package bootcamp.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bootcamp.selenium.basic.LaunchBrowser;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://www.google.com/");

		// default time 0 sec
		// polling time 500 milli seconds

		WebDriverWait wait = new WebDriverWait(driver, 5);
		// polling time is 500milli sec -> 10 attempts

		// WebDriverWait wait1 = new WebDriverWait(driver, 5, 1000);
		// polling time is 100 ms -> 50 attempts

		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q1")));
		searchBox.clear();
		searchBox.sendKeys("Hello");
	}
}
