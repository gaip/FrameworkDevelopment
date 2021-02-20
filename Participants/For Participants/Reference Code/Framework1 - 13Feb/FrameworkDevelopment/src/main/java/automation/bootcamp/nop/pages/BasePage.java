package automation.bootcamp.nop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.bootcamp.nop.file.reader.PropertyReader;

// Wrapper Layer
public class BasePage {

	private WebDriver driver;
	int waitTime;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	protected void openPage(String url) {
		driver.get(url);
	}

	protected void fillTextbox(By locator, String value) {

		WebElement e = locateElement(locator);
		e.clear();
		e.sendKeys(value);
		// screenshot
	}
//
//	private WebElement locateElement(By locator) {
//		return waitUntilVisible(locator);
//
//		
//
//	}
//
//	private void waitUntilVisible(By locator) {
//		WebElement ele = driver.findElement(locator);
//		
//		// to perform some actions
//		try {
//		ele.clear();
//			
//		}catch(StaleElementReferenceException ) {
//			// ret
//			driver.findElement(locator);
//			
//		}
//		// wait impl
//	}
//	
	// retry logic

}
