package bootcamp.test;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 3)
	public void a() {
		System.out.println("Running a");
	}
}
