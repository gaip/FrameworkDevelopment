package bootcamp.testng;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void createData() {
		System.out.println("Dataset created");
	}
}
