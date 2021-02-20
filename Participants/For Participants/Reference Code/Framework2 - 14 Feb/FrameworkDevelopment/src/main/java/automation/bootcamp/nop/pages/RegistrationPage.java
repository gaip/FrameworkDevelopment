package automation.bootcamp.nop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.bootcamp.nop.file.reader.PropertyReader;

public class RegistrationPage extends BasePage {

	private String url = PropertyReader.getProperty("baseUrl") + "/register";

	// page locators
	By gender_male_radioButton = By.id("gender-male");
	By gender_female_radioButton = By.id("gender-female");

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	public void launch() {
		openPage(url);
	}

}