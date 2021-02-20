package bootcamp.test.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import bootcamp.selenium.basic.LaunchBrowser;

public class ScrollWithActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = LaunchBrowser.launch("http://bit.ly/seljavabcamp");

		Actions actions = new Actions(driver);

		// end of page
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		Thread.sleep(2000);

		// top of page
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	}
}
