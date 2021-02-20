package bootcamp.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bootcamp.selenium.basic.LaunchBrowser;

public class KeyboardAction {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://www.google.com/");

		WebElement ele = driver.findElement(By.name("q"));

		ele.sendKeys(Keys.SHIFT);
		ele.sendKeys("alter");

		Actions actions = new Actions(driver); // shift + a -> A
		actions.keyDown(Keys.COMMAND);
		actions.keyDown(Keys.valueOf("w"));
		actions.keyUp(Keys.COMMAND);
		actions.perform();
	}
}
