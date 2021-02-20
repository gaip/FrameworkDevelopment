package automation.bootcamp.nop.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import automation.bootcamp.nop.bo.LoginBo;
import automation.bootcamp.nop.drivermanager.BrowserType;
import automation.bootcamp.nop.drivermanager.DriverFactory;
import automation.bootcamp.nop.file.reader.PropertyReader;
import automation.bootcamp.nop.pageflows.LoginFlow;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	@Test(dataProvider = "loginData")
	public void performLogin(LoginBo login) {
		WebDriver driver = DriverFactory.getDriver();

		LoginFlow.performLogin(driver, login);
	}

	@Test
	public void verifyLoginErrors() {
		PropertyReader reader = new PropertyReader();

		
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://demo.nopcommerce.com/");

	}

	// Create a testcase
	// Create Page classes -> Write assertions to check and proceed.
	// Create wrapper layer
	// Use data provider to login with different credentials
	// Verify parallel execution with testng.xml
}
