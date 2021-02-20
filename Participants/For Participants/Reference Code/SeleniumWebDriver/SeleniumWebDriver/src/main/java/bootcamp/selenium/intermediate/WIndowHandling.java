package bootcamp.selenium.intermediate;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class WIndowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = LaunchBrowser.launch("https://demoqa.com/browser-windows");

		// CDwindow-D55F77B4AF4030D71747DF6C4EB03886

		// current opened tab/window
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);

		driver.findElement(By.id("tabButton")).click();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		allWindows.remove(mainWindow);
		System.out.println("After removing main::" + allWindows);

		for (String win : allWindows) {
			// switch to new tab/win
			driver.switchTo().window(win);

			Thread.sleep(1000);
			driver.close();
		}

		// pointing back to main
		driver.switchTo().window(mainWindow);
		driver.findElement(By.id("windowButton")).click();

		driver.quit();
	}

}
