package bootcamp.test;

import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void a() throws InterruptedException {
		System.out.println("A: "+ Thread.currentThread().getId());
	}
	
	@Test
	public void b() throws InterruptedException {
		System.out.println("B: "+ Thread.currentThread().getId());
	}
}
