package bootcamp.test;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 2)
	public void c1() {

	}

	@Test(priority = 3)
	public void c2() {

	}

	@Test(priority = 1)
	public void c3() {

	}
}
