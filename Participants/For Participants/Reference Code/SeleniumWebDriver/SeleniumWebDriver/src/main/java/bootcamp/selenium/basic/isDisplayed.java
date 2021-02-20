package bootcamp.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class isDisplayed {

	// present in DOM + Visible on UI -> True
	// present in DOM (hidden) + No displayed on UI -> False
	// not present in DOM -> Exception -> NoSuchElementException

	public static void main(String[] args) {
		// WebDriver driver = LaunchBrowser.launch("https://www.google.com/");

		// System.out.println(driver.findElement(By.name("q")).isDisplayed());

		WebDriver driver = LaunchBrowser.launch(
				"file:///Users/kunalashar/automation_bootcamp/SeleniumWebDriver/src/main/resources/hidden.html");

		System.out.println(driver.findElement(By.id("lname1")).isDisplayed());
	}
}
