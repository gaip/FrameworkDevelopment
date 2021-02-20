package bootcamp.selenium.intermediate;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadOnFirefox {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference(null, false);
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		
	}
}
