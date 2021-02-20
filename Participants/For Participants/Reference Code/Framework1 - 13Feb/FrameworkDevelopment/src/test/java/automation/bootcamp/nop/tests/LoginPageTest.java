package automation.bootcamp.nop.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import automation.bootcamp.nop.file.reader.PropertyReader;
import automation.bootcamp.nop.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	@BeforeSuite
	public void loadData() {
		PropertyReader pr = new PropertyReader();

		System.out.println(pr.getProperty("baseUrl"));
	}

	@Test
	public void performLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		LoginPage login = new LoginPage(driver);
		login.launch();
		login.fillUsername("");
		login.forgotPassword();
	}

	@Test
	public void verifyLoginErrors() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
	
	// Create a testcase
	// Create Page classes -> Write assertions to check and proceed.
	// Create wrapper layer
	// Use data provider to login with different credentials
	// Verify parallel execution with testng.xml
}
