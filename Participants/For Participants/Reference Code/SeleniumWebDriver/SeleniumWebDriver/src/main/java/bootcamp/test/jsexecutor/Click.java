package bootcamp.test.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class Click {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/buttons");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);
	}
}
