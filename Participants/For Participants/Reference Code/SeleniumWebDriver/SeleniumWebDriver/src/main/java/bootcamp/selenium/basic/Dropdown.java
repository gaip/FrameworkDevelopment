package bootcamp.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	// 1. Simple Dropdown -> Single select
	// 2. Multi Select
	// 3. Combo Box -> Dropdown + Textbox

	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://demo.automationtesting.in/Register.html");

		WebElement skills = driver.findElement(By.id("Skills"));
		Select select = new Select(skills);
		System.out.println(select.isMultiple());

		select.selectByIndex(2);
		// select.selectByValue("Certifications"); // value attribute of option tag
		// select.selectByVisibleText("AutoCAD");

		System.out.println(select.getFirstSelectedOption());

	}
}
