package bootcamp.test.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bootcamp.selenium.basic.LaunchBrowser;

public class ScrollToElement {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://bit.ly/seljavabcamp");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement button = driver
				.findElement(By.xpath("//span[@class='elementor-button-text' and text()='Book Your Spot']"));

		js.executeScript("arguments[0].scrollIntoView();", button);
	}
}
