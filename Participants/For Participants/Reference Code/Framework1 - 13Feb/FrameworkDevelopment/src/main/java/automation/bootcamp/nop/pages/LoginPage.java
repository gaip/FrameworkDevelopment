package automation.bootcamp.nop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.bootcamp.nop.file.reader.PropertyReader;

public class LoginPage extends BasePage {

	private String url = PropertyReader.getProperty("baseUrl") +"/login";

	// locators
	By username_textbox = By.id("");
	By password_textbox = By.id("");
	By forgot_password_link = By.id("");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void launch() {
		openPage(url);
	}

	public void fillUsername(String username) {
		fillTextbox(username_textbox, username);
	}

	public void fillPassword(String password) {
		fillTextbox(password_textbox, password);
	}

	public void forgotPassword() {

	}

}
