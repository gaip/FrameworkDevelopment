package bootcamp.testng;

import org.testng.annotations.Test;

public class DependsOnGroup {

	@Test(groups = "order", dependsOnGroups = "login", alwaysRun = true)
	public void orderCreation() {
		System.out.println("order created");
	}
}
