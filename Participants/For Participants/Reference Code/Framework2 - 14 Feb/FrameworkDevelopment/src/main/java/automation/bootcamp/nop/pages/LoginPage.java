package automation.bootcamp.nop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.bootcamp.nop.file.reader.PropertyReader;

public class LoginPage extends BasePage {

	private String url = PropertyReader.getProperty("baseUrl") + "/login";

	// locators
	By email_textbox = By.id("Email");
	By password_textbox = By.id("Password");
	By login_button = By.cssSelector("[type=submit]");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void launch() {
		openPage(url);
	}

	public void fillUsername(String username) {
		enterText(email_textbox, username);
	}

	public void fillPassword(String password) {
		enterText(password_textbox, password);
	}

	public void login() {
		click(login_button);
	}

}
