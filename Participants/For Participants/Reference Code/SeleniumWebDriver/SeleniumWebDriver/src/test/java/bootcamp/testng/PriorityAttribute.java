package bootcamp.testng;

import org.testng.annotations.Test;

public class PriorityAttribute {

	@Test(priority = 4)
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = 2)
	public void test6() {
		System.out.println("test4");
	}

	@Test(priority = 1)
	public void test3() {
		System.out.println("test3");
	}

	@Test(priority = 3)
	public void test2() {
		System.out.println("test2");
	}

	// default priority is 0
	@Test
	public void test5() {
		System.out.println("test5");
	}

	@Test // 0
	public void test4() {
		System.out.println("test4");
	}

}
