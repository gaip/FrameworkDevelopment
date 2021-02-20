package bootcamp.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class ScrollToElementWithJS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = LaunchBrowser.launch("https://www.thetesttribe.com/automation-bootcamp-selenium-java/");

		WebElement ele = driver
				.findElement(By.xpath("//span[@class='elementor-button-text' and text()='Book Your Spot']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

}
