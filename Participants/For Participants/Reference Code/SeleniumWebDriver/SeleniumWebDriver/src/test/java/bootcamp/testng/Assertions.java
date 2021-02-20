package bootcamp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	public void test1() {
		Assert.assertEquals("hello", "hello1");
		System.out.println("after assert");
	}

	@Test
	public void test2() {
		if(isActiveUser) {
			
		} else
			System.out.println();
		Assert.assertTrue(true); // pass
		//Assert.assertTrue(false); // fail
	}

	@Test
	public void test3() {
		Assert.assertFalse(false); // pass
		//Assert.assertFalse(true); // fail
	}
}
