package bootcamp.test.jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class InnerText {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("http://bit.ly/seljavabcamp");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String str = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(str);
	}
}
