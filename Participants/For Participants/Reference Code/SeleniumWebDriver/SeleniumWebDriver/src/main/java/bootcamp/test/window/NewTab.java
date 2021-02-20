package bootcamp.test.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to launch a page
		driver.get("https://demoqa.com/browser-windows");

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.id("tabButton")).click();

		Set<String> allWindows = driver.getWindowHandles();

		System.out.println(allWindows.size()); // 2

		allWindows.remove(parentWindow);

		System.out.println(allWindows.size()); // 1

		for (String win : allWindows) {
			driver.switchTo().window(win);
			driver.close();
		}

		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.id("windowButton")).isDisplayed());

	}
}
