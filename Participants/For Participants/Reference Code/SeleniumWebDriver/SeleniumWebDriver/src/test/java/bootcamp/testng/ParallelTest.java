package bootcamp.testng;

import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void test1() {
		System.out.println("Test1: " + Thread.currentThread().getId());
	}

	@Test
	public void test2() {
		System.out.println("Test2: " + Thread.currentThread().getId());
	}
}
