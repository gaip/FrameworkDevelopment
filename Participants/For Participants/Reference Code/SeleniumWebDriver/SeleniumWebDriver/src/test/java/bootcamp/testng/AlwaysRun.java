package bootcamp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	@Test
	public void login() {
		System.out.println("Perform login operation");
		Assert.assertTrue(false);
	}

	@Test(alwaysRun = true)
	public void verifyHomePage() {
		System.out.println("Verify text on homepage");
	}
}
