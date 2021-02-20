package bootcamp.test.skyscanner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import bootcamp.selenium.basic.LaunchBrowser;

public class StartUp {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{

		// load driver
		driver = LaunchBrowser.launch("https://www.skyscanner.com.sg/");

		// select trip type
		selectTripType(TripType.ONEWAY);

		// select departure airport
		departureAirport("Dubai (DXB)");

		// select arrival airport
		arrivaleAirport("Mumbai (BOM)");

		// select departure date
		departureDate("7");

		// fill traveller info
		fillTravellerInformation("Business", 3, 2, 4, 6);

		Thread.sleep(2000);
		driver.quit();

	}

	/**
	 * Selects Trip Type to book ticket
	 * 
	 * @param tripType
	 */
	private static void selectTripType(TripType tripType) {

		switch (tripType) {
		case RETURN:
		case MULTICITY:
			System.out.println("Trip Type implementation is pending");
			break;

		case ONEWAY:
			driver.findElement(By.id("fsc-trip-type-selector-one-way")).click();
			break;
		}
	}

	private static void departureAirport(String airportName) {

		// fill depature value
		WebElement departure = driver.findElement(By.id("fsc-origin-search"));
		departure.clear();
		departure.sendKeys(airportName);

		// select airport
		selectAirportFromSuggestion(airportName);

	}

	private static void arrivaleAirport(String airportName) {

		WebElement arrival = driver.findElement(By.id("fsc-destination-search"));
		arrival.clear();
		arrival.sendKeys(airportName);

		// select airport
		selectAirportFromSuggestion(airportName);

	}

	/**
	 * Selects suggestions from departure and arrival airport
	 * 
	 * @param airportName
	 */
	private static void selectAirportFromSuggestion(String airportName) {
		// select from suggestions
		List<WebElement> fromList = driver.findElements(By.cssSelector("li[class^=BpkAutosuggest_bpk]"));

		// iterating on the list
		for (WebElement from : fromList) {

			// get all values form the list
			WebElement airport = from.findElement(By.cssSelector("span[class*=suggestion-value]"));

			// select option if airport found
			if (airport.getText().equals(airportName)) {
				airport.click();
				break;
			}
		}
	}

	/**
	 * Select traveling date
	 * 
	 * @param date
	 */
	private static void departureDate(String date) {
		driver.findElement(By.id("depart-fsc-datepicker-button")).click();

		List<WebElement> dateList = driver.findElements(By.cssSelector("[class*=calendar-date]"));

		// select date from the calendar
		for (WebElement d : dateList) {
			if (d.getAttribute("aria-label").contains(date)) {
				d.click();
				break;
			}
		}
	}

	/**
	 * Fill Passenger information
	 * 
	 * @param cabinClass
	 * @param numberOfAdults
	 * @param numberOfChildren
	 * @param childrenAge
	 */
	private static void fillTravellerInformation(String cabinClass, int numberOfAdults, int numberOfChildren,
			int... childrenAge) {
		// open cabin selector
		driver.findElement(By.cssSelector("button[class*=CabinClassTravellersSelector]")).click();

		// select cabin class
		Select select = new Select(driver.findElement(By.id("search-controls-cabin-class-dropdown")));
		select.selectByValue(cabinClass);

		// fill adult info
		selectAdults(numberOfAdults);

		// fill children info
		selectChildrens(numberOfChildren, childrenAge);

		// submit traveller info
		driver.findElement(By.xpath("//button[text()='Done']")).click();

	}

	/**
	 * Select Number of Adults traveling
	 * 
	 * @param numberOfAdults
	 */
	private static void selectAdults(int numberOfAdults) {
		// number of adults
		if (numberOfAdults == 0) {
			System.out.println("Minimum 1 Adult required");
		} else if (numberOfAdults == 1) {
			System.out.println("1 Adult selected by default");
		} else {

			// locate counter
			WebElement increaseAdultCount = driver
					.findElement(By.xpath("//button[@title='Increase number of adults']"));

			// increment count
			for (int i = 0; i < numberOfAdults - 1; i++) {
				increaseAdultCount.click();
			}
		}

		// value total number present on the screen
		String adultValueOnScreen = driver.findElement(By.id("search-controls-adults-nudger")).getAttribute("value");

		if (numberOfAdults != Integer.parseInt(adultValueOnScreen)) {
			System.out.println("Incorrect number of adults displayed on screen");
		}
	}

	/**
	 * Select NUmber of children traveling
	 * 
	 * @param numberOfChildren
	 * @param childrenAge
	 */
	private static void selectChildrens(int numberOfChildren, int... childrenAge) {
		if (numberOfChildren > 0) {

			// locate counter
			WebElement increaseChildrenCount = driver
					.findElement(By.xpath("//button[@title='Increase number of children']"));

			// increase count
			for (int i = 0; i < numberOfChildren; i++) {
				increaseChildrenCount.click();

				// select age from dropdown
				Select select = new Select(driver.findElement(By.id("children-age-dropdown-" + i)));
				select.selectByValue(childrenAge[i] + "");
			}
		}
	}

}
