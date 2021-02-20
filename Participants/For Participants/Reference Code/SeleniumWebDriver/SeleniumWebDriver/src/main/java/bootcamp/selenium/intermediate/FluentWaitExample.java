package bootcamp.selenium.intermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import bootcamp.selenium.basic.LaunchBrowser;

public class FluentWaitExample {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://www.google.com/");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class);

		try {
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q1")));
		}catch (NoSuchElementException e) {
			System.out.println("ele no present");
		}
		
		
		WebElement ele2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q2")));
	}
	
	
	//Explicit and fluent
	// no polling in explicit
	// 
}
