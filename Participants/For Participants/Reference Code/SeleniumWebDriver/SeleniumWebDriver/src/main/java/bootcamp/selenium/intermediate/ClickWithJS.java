package bootcamp.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class ClickWithJS {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/buttons");
		
		WebElement ele = driver.findElement(By.xpath(".//button[text()='Click Me']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
}
