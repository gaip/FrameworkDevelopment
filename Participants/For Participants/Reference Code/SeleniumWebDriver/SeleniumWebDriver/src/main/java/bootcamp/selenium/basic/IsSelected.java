package bootcamp.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IsSelected {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://demo.automationtesting.in/Register.html");

		WebElement element = driver.findElement(By.id("checkbox1"));

		System.out.println(element.isSelected());
		element.click();
		System.out.println(element.isSelected());
	}
}
