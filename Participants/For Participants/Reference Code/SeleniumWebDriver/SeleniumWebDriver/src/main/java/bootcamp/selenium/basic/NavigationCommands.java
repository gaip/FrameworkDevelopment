package bootcamp.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximize browser window
		driver.manage().window().maximize();

		// to launch a page
		driver.get("https://www.google.com/");
		
		// to navigate to another page
		driver.navigate().to("https://www.thetesttribe.com/");
		
		// to go back to previous page
		driver.navigate().back();
		
		// to go to the next page
		driver.navigate().forward();
		
		// to refresh the page
		driver.navigate().refresh();
		
		//Interview question: In how many ways can we refresh a page?

		// close driver
		driver.quit();
	}
}
