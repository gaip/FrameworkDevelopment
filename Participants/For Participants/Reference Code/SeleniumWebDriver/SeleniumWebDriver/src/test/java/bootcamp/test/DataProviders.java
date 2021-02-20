package bootcamp.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

public class DataProviders {
	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		return new Object[][] { { "User1", "Pass1" }, { "User2", "Pass2" } };
	}

	@DataProvider(name = "calculation")
	public Object[][] getCalculationData(Method method) {
		switch (method.getName()) {
		case "sum":
			return new Object[][] { { 1, 7, 8 }, { 5, 6, 12 } };
		case "diff":
			return new Object[][] { { 13, 7, 6 }, { 5, 6, -1 } };
		default:
			System.out.println("Data Not Present");
		}

		return null;
	}

	@DataProvider(name = "userInfo")
	public Object[][] getUserInfo() {
		List<UserBO> userList = new ArrayList<UserBO>();

		// to create fake data
		Faker faker = new Faker();
		Object[][] object = new Object[userList.size()][];

		for (int i = 0; i < 5; i++) {
			UserBO user = new UserBO();
			user.setFirstName(faker.name().firstName());
			user.setLastName(faker.name().lastName());
			user.setUsername(faker.internet().emailAddress());
			user.setPassword(faker.internet().password());
			userList.add(user);
			object[i][0] = user;
		}

		return object;

	}
}
