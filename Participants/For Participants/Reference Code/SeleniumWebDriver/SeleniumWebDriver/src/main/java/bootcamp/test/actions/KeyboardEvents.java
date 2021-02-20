package bootcamp.test.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bootcamp.selenium.basic.LaunchBrowser;

public class KeyboardEvents {
	public static void main(String[] args) {
		// send keys only send one key at a time

		// to perform complex keyboard events we require Actions class

		WebDriver driver = LaunchBrowser.launch("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys(Keys.SHIFT);
		searchBox.sendKeys("a");

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).build().perform();
	}

}
