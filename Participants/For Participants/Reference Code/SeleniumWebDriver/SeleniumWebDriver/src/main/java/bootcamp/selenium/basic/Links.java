package bootcamp.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Links {

	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/links");

		//driver.findElement(By.id("simpleLink")).click();
		
		//driver.findElement(By.linkText("Home")).click();
		
		driver.findElement(By.partialLinkText("Bad")).click();
		
		//driver.quit();

	}

}
