package bootcamp.selenium.intermediate;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import bootcamp.selenium.basic.LaunchBrowser;

public class ScrollWithActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = LaunchBrowser.launch("https://www.thetesttribe.com/automation-bootcamp-selenium-java/");

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(2000);
		
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	}
}
