package bootcamp.testng;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTest {
	
	@BeforeMethod
	public void setup() {
		System.out.println("bm: basic test");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(false);
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@AfterMethod
	public void teadDown() {
		System.out.println("am: basic test");
	}
}
