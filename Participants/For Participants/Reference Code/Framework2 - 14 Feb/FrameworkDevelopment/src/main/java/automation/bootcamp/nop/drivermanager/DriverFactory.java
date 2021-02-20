package automation.bootcamp.nop.drivermanager;

import org.openqa.selenium.WebDriver;

import automation.bootcamp.nop.drivermanager.types.ChromeManager;
import automation.bootcamp.nop.drivermanager.types.FirefoxManager;
import automation.bootcamp.nop.file.reader.PropertyReader;

public class DriverFactory {

	public static WebDriver getDriver() {
		
		WebDriver driver = null;
		
		String browserName = PropertyReader.getProperty("browser");

		switch (BrowserType.valueOf(browserName.toUpperCase())) {
		case CHROME:
				driver = new ChromeManager().getDriver();
			break;
		case FIREFOX:
				driver = new FirefoxManager().getDriver();
			break;

		default:
			System.out.println("Unsupported browser");
		}

		return driver;
	}

}
