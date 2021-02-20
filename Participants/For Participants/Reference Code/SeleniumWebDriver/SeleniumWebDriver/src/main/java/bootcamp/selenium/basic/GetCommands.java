package bootcamp.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetCommands {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/links");

		String textValue = driver.findElement(By.id("moved123")).getText();
		System.out.println(textValue);

		String attributeValue = driver.findElement(By.id("dynamicLink")).getAttribute("href");
		System.out.println(attributeValue);

		driver.quit();
	}
}
