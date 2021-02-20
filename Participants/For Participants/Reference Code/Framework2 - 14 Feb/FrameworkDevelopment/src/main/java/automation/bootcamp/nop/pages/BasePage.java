package automation.bootcamp.nop.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Wrapper Layer
public abstract class BasePage {

	private WebDriver driver;
	private WebDriverWait webDriverWait;

	/**
	 * Set values for instance variables
	 */
	public BasePage(WebDriver driver) {
		this.driver = driver;
		webDriverWait = new WebDriverWait(driver, 20);
	}

	/**
	 * Open Requested page
	 *
	 * @param pageUrl
	 */
	protected void openPage(String pageUrl) {
		driver.get(pageUrl);
		waitForPageLoad();
	}

	/**
	 * Return current page url
	 *
	 * @return url string
	 */
	protected String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * Perform click operation on given locator
	 *
	 * @param locator
	 */
	protected void click(By locator) {
		waitTillElementClickable(locator).click();
	}

	/**
	 * Enter text on UI
	 *
	 * @param locator     locator
	 * @param textToEnter text string
	 */
	protected void enterText(By locator, String textToEnter) {
		WebElement webElement = waitTillElementVisible(locator);

		// checking if element is enabled before sending text
		if (webElement.isEnabled())
			webElement.sendKeys(textToEnter);
	}

	/**
	 * Get Element Text from UI
	 *
	 * @param locator
	 * @return UI Text
	 */
	protected String getText(By locator) {
		return waitTillElementVisible(locator).getText();
	}

	/**
	 * Check if element is displayed on Page
	 *
	 * @param locator
	 * @return flag
	 */
	protected boolean isElementDisplayed(By locator) {
		return waitTillElementVisible(locator).isDisplayed();
	}

	/**
	 * Get All matching elements
	 *
	 * @param locator
	 * @return list of web elements
	 */
	protected List<WebElement> getAllElements(By locator) {
		return waitTillAllElementsVisible(locator);
	}

	/**
	 * Wait until element is visible on page
	 *
	 * @param locator locator
	 * @return webElement
	 */
	protected WebElement waitTillElementVisible(By locator) {
		return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * Wait until element is clickable on page
	 *
	 * @param locator
	 * @return webElement
	 */
	protected WebElement waitTillElementClickable(By locator) {
		return webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * Wait until all matching elements are visible
	 *
	 * @param locator
	 * @return list of web elements
	 */
	protected List<WebElement> waitTillAllElementsVisible(By locator) {
		return webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	/**
	 * Wait until page is loaded
	 */
	protected void waitForPageLoad() {
		((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
	}

}