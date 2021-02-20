package bootcamp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "login")
	public void loginWithValidCreds() {
		Assert.assertFalse(true);
	}

	@Test(groups = "login")
	public void loginWithInValidCreds() {

	}

	@Test(groups = { "forgotUname", "login" })
	public void forgotUsername() {

	}

	@Test(groups = "forgotPwd")
	public void forgotPassword() {

	}
}
