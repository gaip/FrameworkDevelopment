package bootcamp.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class ThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = LaunchBrowser.launch("https://www.google.com/");

		Thread.sleep(2000);
		
		// 0 -> 1-3
		
		// Sleep : 3
		// 1.5 
		// 1000 -> 0.5 100/200
		
		WebElement ele = driver.findElement(By.name("q"));		
		ele.sendKeys("Hello");
	}
}
