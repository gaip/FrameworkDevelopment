package bootcamp.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

	@Test
	@Parameters({ "num1", "num2" })
	public void sum(int a, int b) {
		System.out.println(a + b);
	}
}
