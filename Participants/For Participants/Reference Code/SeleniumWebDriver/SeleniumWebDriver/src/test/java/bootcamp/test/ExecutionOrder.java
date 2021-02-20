package bootcamp.test;

import org.testng.annotations.Test;

public class ExecutionOrder {
	@Test
	public void a() {
		System.out.println("Test a");
	}

	@Test
	public void c() {
		System.out.println("Test c");
	}

	@Test
	public void b() {
		System.out.println("Test b");
	}

	@Test
	public void A() {
		System.out.println("Test A");
	}

	@Test
	public void C() {
		System.out.println("Test C");
	}

	@Test
	public void B() {
		System.out.println("Test B");
	}
}
