package bootcamp.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DepandsOn {

	@BeforeMethod
	public void setup() {
		System.out.println("bm: depends on");
	}

	@Test
	public void login() {
		System.out.println("Perform login operation");
		// Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "login")
	public void verifyHomePage() {
		System.out.println("Verify text on homepage");
	}

	@AfterMethod
	public void teardown() {
		System.out.println("am: depends on");
	}
}
