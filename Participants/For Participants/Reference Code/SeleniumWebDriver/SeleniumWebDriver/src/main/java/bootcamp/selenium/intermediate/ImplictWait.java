package bootcamp.selenium.intermediate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class ImplictWait {

	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// default time 0 sec
		// polling time 500 milli seconds -> 0.5 sec

		driver.findElement(By.name("q1")).sendKeys("hello");
	}

}
