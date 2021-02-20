package bootcamp.selenium.intermediate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class ScrollWithJS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/buttons");
		
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
}
