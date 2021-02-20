package bootcamp.test.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bootcamp.selenium.basic.LaunchBrowser;

public class IFrame {

	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/frames");

		// this element is present inside frame
		// driver.findElement(By.id("sampleHeading")); // NoSuchElementException

		WebElement frame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());

		// locate text on main page
		// System.out.println(driver.findElement(By.cssSelector("#framesWrapper div")).getText());
		// NoSuchElementException
		
		
		// switch back to main page (outside frame)
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.cssSelector("#framesWrapper div")).getText());
		
	}
}
