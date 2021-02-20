package bootcamp.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/select-menu");

		WebElement multiSelect = driver.findElement(By.id("cars"));
		Select select = new Select(multiSelect);
		
		System.out.println(select.isMultiple());

		select.selectByIndex(0);
		select.selectByIndex(2);
	}
}
