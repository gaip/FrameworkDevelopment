package bootcamp.test.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bootcamp.selenium.basic.LaunchBrowser;

public class MouseHover {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/menu");
		WebElement menu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));

		Actions actions = new Actions(driver);

		// no visible effect on UI
		actions.moveToElement(menu);
		System.out.println("After moving to the element");

		// no visible effect on UI
		actions.moveToElement(menu).build();
		System.out.println("After building the element");

		// to perform action on UI
		actions.moveToElement(menu).build().perform();
	}
}
