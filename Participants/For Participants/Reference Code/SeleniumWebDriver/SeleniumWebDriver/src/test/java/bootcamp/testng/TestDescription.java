package bootcamp.testng;

import org.testng.annotations.Test;

public class TestDescription {
	
	@Test(description = "Login with Invalid credentials")
	public void loginToApplication() {
		System.out.println("running a");
	}

}
