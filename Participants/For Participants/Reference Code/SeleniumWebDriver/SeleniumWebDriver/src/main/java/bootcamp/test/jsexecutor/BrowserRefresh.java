package bootcamp.test.jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class BrowserRefresh {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://bit.ly/seljavabcamp");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
}
