package bootcamp.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@BeforeClass
	public void beforeClass() {

		System.out.println("Executing Test Class - AppTest.");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("***Finished Executing Test Class - AppTest.");
	}

	@BeforeMethod
	public void beforeTest() {

		System.out.println("Starting a new Test.");
	}

	@AfterMethod
	public void afterTest() {

		System.out.println("Finished Executing new Test.");
	}

	/**
	 * Rigorous Test :-)
	 */
	@org.testng.annotations.Test
	public void app1Test1() {
		System.out.println("Test App1Test1 is in progress.");
	}

	@org.testng.annotations.Test
	public void app1Test2() {

		System.out.println("Test App1Test2 is in progress.");
	}

}
