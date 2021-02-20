package bootcamp.testng;

import org.testng.annotations.Test;

public class EnabledAttribute {

	@Test
	public void a() {
		System.out.println("running from a");
	}
	
	
	@Test(enabled = false)
	public void b() {
		System.out.println("running from b");
	}
}
