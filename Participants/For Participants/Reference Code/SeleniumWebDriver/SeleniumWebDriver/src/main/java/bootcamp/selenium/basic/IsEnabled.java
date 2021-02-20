package bootcamp.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IsEnabled {
	
	// disabled -> false
	// enabled -> true

	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch(
				"file:///Users/kunalashar/automation_bootcamp/SeleniumWebDriver/src/main/resources/hidden.html");

		WebElement element = driver.findElement(By.id("lname"));
		
		System.out.println(element.isEnabled());
	}
}
