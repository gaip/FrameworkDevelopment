package bootcamp.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


// login Test 
// checkouttest              BAseTest -> @BS/AFT
// paymentTest

public class BeforeAndAfterAnnotations {
	
	
	// 1. @Test
	// 2. BS
	// 3. AS
	// 4. BM
	// 5. AM

	@BeforeSuite
	public void beforeClassRun() {
		System.out.println("Running Before class");
	}

	@AfterSuite
	public void afterClassRun() {
		System.out.println("Running After class");
	}

	@BeforeMethod
	public void launchBrowser() {
		System.out.println("launching browser");
	}

	@Test
	public void performLogin() {
		System.out.println("Running login");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("closing browser");
	}

	@Test
	public void forgotUsername() {
		System.out.println("open forgot username model");
	}
}
