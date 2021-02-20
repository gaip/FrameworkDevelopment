package bootcamp.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bootcamp.selenium.basic.LaunchBrowser;

public class MouseHover {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/menu");

		WebElement menu = driver.findElement(By.linkText("Main Item 2"));

		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		
		// actions -> operations to perform (1 or more than 1)
	}
}
