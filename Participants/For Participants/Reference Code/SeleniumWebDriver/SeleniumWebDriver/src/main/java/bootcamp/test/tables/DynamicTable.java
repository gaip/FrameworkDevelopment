package bootcamp.test.tables;

import org.openqa.selenium.WebDriver;

import bootcamp.selenium.basic.LaunchBrowser;

public class DynamicTable {
	public static void main(String[] args) {
		WebDriver driver = LaunchBrowser.launch("https://money.rediff.com/gainers/bse/monthly/groupall");
		
		// rest implementation is same as Static Table
	}
}
