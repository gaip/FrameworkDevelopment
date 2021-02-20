package bootcamp.test.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVG {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to launch a page
		driver.get("https://demoqa.com/checkbox");

		String selectMenu = "Home";

		List<WebElement> elements = driver.findElements(By.className("rct-title"));

		for (WebElement e : elements) {
			if (e.getText().equalsIgnoreCase(selectMenu)) {
				e.findElement(By.xpath(
						".//span[@class='rct-title']/../span[@class='rct-checkbox']//*[local-name()='svg' and @class='rct-icon rct-icon-uncheck']"))
						.click();
			}
		}
	}
}
