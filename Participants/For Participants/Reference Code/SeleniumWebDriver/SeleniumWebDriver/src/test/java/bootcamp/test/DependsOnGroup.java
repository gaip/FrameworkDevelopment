package bootcamp.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {
	@Test(groups = "P1")
	public void a() {
		Assert.assertTrue(false);
		System.out.println("running a");
	}

	@Test(groups = "P1")
	public void c() {
		System.out.println("running c");
	}

	@Test(groups = "P2", dependsOnGroups = "P1")
	public void d() {
		System.out.println("running d");
	}

	@Test(groups = "P2", dependsOnGroups = "P1")
	public void b() {
		System.out.println("running b");
	}

	@Test(groups = "P2", dependsOnGroups = "P1")
	public void f() {
		System.out.println("running f");
	}
}
