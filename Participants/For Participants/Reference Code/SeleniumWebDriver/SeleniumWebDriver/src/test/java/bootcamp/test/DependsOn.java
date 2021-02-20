package bootcamp.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

	@Test
	public void a() {
		System.out.println("running a");
	}

	@Test(dependsOnMethods = "a")
	public void b() {
		System.out.println("running b");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "a", "b" })
	public void c() {
		System.out.println("running c");
	}
}
