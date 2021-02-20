package automation.bootcamp.nop.pageflows;

import org.openqa.selenium.WebDriver;

import automation.bootcamp.nop.bo.LoginBo;
import automation.bootcamp.nop.pages.LoginPage;

public class LoginFlow {

	public static void performLogin(WebDriver driver, LoginBo loginBo) {
		LoginPage login = new LoginPage(driver);
		login.launch();
		login.fillUsername(loginBo.getUsername());
		login.fillPassword(loginBo.getPassword());
		login.login();
	}
}
