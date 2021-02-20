package bootcamp.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bootcamp.selenium.basic.LaunchBrowser;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/buttons");

		WebElement button = driver.findElement(By.id("doubleClickBtn"));

		Actions actions = new Actions(driver);
		actions.moveToElement(button).doubleClick().perform();
	}
}
