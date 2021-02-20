package bootcamp.test.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximize browser window
		driver.manage().window().maximize();

		// to launch a page
		driver.get("https://www.google.com/");

		WebDriverWait wait1 = new WebDriverWait(driver, 2, 1000); // tried for 10 second(s) with 500 milliseconds
																	// interval
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='q1']"))).sendKeys("Test");

		// WebDriverWait wait2 = new WebDriverWait(driver, 5, 1000);
		// WebDriverWait wait3 = new WebDriverWait(driver, null, null, 0, 0)

		WebElement element = new WebDriverWait(driver, 2)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='q']")));
		element.sendKeys("Test2");

		Thread.sleep(2000);
		driver.quit();
	}
}
