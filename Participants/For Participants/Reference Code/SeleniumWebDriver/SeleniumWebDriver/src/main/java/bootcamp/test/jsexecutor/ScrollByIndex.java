package bootcamp.test.jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class ScrollByIndex {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://bit.ly/seljavabcamp");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
	}
}
