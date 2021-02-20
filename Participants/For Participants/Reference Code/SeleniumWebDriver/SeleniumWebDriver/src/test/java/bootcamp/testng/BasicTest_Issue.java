package bootcamp.testng;

import org.testng.annotations.Test;

public class BasicTest_Issue {
	@Test(invocationCount = 1)
	public void a() {
		System.out.println("Test a");
	}

	@Test
	public void b() {
		System.out.println("Test b");
	}

	@Test
	public void c() {
		System.out.println("Test c");
	}

}