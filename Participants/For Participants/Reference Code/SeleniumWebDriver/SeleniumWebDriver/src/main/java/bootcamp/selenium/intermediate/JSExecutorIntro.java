package bootcamp.selenium.intermediate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class JSExecutorIntro {
	// Inject JS on browser
	
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(null, args);
	}
}
