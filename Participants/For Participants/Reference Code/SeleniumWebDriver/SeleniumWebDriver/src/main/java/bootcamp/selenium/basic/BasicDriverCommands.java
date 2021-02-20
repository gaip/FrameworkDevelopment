package bootcamp.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicDriverCommands {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximize browser window
		driver.manage().window().maximize();

		// fullscreen mode
		driver.manage().window().fullscreen();

		// to launch a page
		driver.get("https://www.google.com/");

		// to find page url
		System.out.println(driver.getCurrentUrl());

		// to find title
		System.out.println(driver.getTitle());

		// to close a browser
		//driver.quit(); // -> close all tabs
		driver.close(); //-> current tab
	}
}
