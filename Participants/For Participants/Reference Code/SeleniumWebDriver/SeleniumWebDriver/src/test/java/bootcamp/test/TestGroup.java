package bootcamp.test;

import org.testng.annotations.Test;

public class TestGroup {

	@Test(groups = "G1")
	public void a() {
		System.out.println("running a");
	}

	@Test(groups = "G1")
	public void c() {
		System.out.println("running c");
	}

	@Test(groups = "G2")
	public void d() {
		System.out.println("running d");
	}

	@Test(groups = "G2")
	public void b() {
		System.out.println("running b");
	}

	@Test(groups = "G2")
	public void f() {
		System.out.println("running f");
	}

}
