package automation.bootcamp.nop.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation.bootcamp.nop.bo.LoginBo;
import automation.bootcamp.nop.bo.RegisterStudentBo;
import automation.bootcamp.nop.file.reader.PropertyReader;
import automation.bootcamp.nop.pageflows.LoginFlow;
import automation.bootcamp.nop.pages.LoginPage;
import automation.bootcamp.nop.utilities.LoginUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPageTest extends LoginUtils {

	@Test(dataProvider = "studentData")
	public void registerStudent(RegisterStudentBo registerStudent) {

		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// perform login
		LoginFlow.performLogin(driver, getLoginCredentials("Approver"));

		// assert login
		Assert.assertTrue(false);

		// submit registration form
		// object of regPage
		//
		//
		//
		//
		//
		//
		// caspture id from UI
//		
		// reading approach
		// automation from scratch
//		 - tool -> 
//		- language
		// selenium behaviour -> 
		// selenium + sql // host + schema + port + usre/pass

		// assert success message
		Assert.assertTrue(false);

		// verify reg form
		// search using id
		//

		LoginFlow.performLogin(driver, getLoginCredentials("Submitter"));

		// assert reg form present or not
		Assert.assertTrue(false);
	}

	@Test
	public void de_registerStudent() {

		// launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// perform login
		LoginFlow.performLogin(driver, login);

		// assert login
		Assert.assertTrue(false);

		// submit registration form
		// object of regPage
		//
		//
		//

		// assert success message
		Assert.assertTrue(false);

		// verify reg form
		//
		//

		// assert reg form present or not
		Assert.assertTrue(false);
	}
}
