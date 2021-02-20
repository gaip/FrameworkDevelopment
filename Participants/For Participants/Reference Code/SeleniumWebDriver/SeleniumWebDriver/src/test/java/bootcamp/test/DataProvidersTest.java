package bootcamp.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class DataProvidersTest {

	@Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
	public void login(String username, String password) {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	@Test(dataProvider = "calculation", dataProviderClass = DataProviders.class)
	public void sum(int num1, int num2, int result) {
		Assert.assertEquals(num1 + num2, result);
	}

	@Test(dataProvider = "calculation", dataProviderClass = DataProviders.class)
	public void diff(int num1, int num2, int result) {
		Assert.assertEquals(num1 - num2, result);
	}

	@Test(dataProvider = "userInfo")
	public void printUserDetails(UserBO user) {
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
	}

	@DataProvider(name = "userInfo")
	public Object[][] getUserInfo() {
		int max_limit = 5;

		// to create fake data
		Faker faker = new Faker();
		Object[][] object = new Object[max_limit][1];

		for (int i = 0; i < max_limit; i++) {
			UserBO user = new UserBO();
			user.setFirstName(faker.name().firstName());
			user.setLastName(faker.name().lastName());
			user.setUsername(faker.internet().emailAddress());
			user.setPassword(faker.internet().password());
			object[i][0] = user;
		}
		return object;
	}
}
