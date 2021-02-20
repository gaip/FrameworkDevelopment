package bootcamp.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {

	@Test
	public void a() {
		System.out.println("running a");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "a", alwaysRun = true)
	public void b() {
		System.out.println("running b");
	}
}
