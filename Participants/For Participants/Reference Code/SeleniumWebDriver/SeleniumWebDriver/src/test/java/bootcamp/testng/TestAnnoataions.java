package bootcamp.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnoataions {
	
	//@BeforeClass
	//@BeforeMethod
	//@Test -> Skipped

//	@Test
//	@AfterMethod
//	@AfterClass
	
	
	@Test
	public void a() {
		System.out.println("@Test");
	}
	
	@BeforeMethod
	public void b() {
		// launch browser
	}
	
	@BeforeClass
	public void c() {
		
	}
}
