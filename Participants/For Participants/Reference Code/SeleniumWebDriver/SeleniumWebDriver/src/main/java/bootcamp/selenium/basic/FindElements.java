package bootcamp.selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://demo.automationtesting.in/Register.html");

		List<WebElement> elementList = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement e : elementList) {
			String attr = e.getAttribute("value");
			System.out.println(attr);

			if (attr.equalsIgnoreCase("MOviEs")) {
				e.click();
			}
		}
	}
}
