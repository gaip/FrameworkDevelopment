package automation.bootcamp.nop.drivermanager.types;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import automation.bootcamp.nop.drivermanager.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxManager extends DriverManager {

	@Override
	public WebDriver getDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
