package bootcamp.test.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximize browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// to launch a page
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@name='q1']"));
		
		searchBox.sendKeys("Test");
		searchBox.clear();	
		
		driver.quit();

	}
}
