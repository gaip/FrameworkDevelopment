package bootcamp.test.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class HorizontalScroll {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://www.google.com/");
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Hello");
		ele.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(200,0)");
	}
}
