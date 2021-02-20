package automation.bootcamp.nop.pages;

import automation.bootcamp.nop.file.reader.PropertyReader;

public class SearchListingPage {

	private String url = PropertyReader.getProperty("baseUrl") + "/search";

	public boolean verifyUrl() {
		return false;

	}
}
