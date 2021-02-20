package bootcamp.test.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class Nested {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/nestedframes");

		WebElement parentF = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(parentF);

		WebElement childF = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(childF);

		System.out.println(driver.findElement(By.tagName("p")).getText());

		// will bring back to main page (out of parent frame)
		driver.switchTo().defaultContent();

		System.out.println(driver.findElement(By.cssSelector("#framesWrapper div")).getText());

		driver.close();
	}
}
