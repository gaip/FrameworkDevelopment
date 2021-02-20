package bootcamp.testng;

import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.gson.JsonObject;

import bootcamp.selenium.advance.UserBO;
import bootcamp.selenium.advance.file.json.JsonReader_Reem;

public class BaseTest {

	@DataProvider(name = "loginData")
	public Object[][] getData() {

		int max_limit = 3;
		Faker faker = new Faker();

		Object[][] object = new Object[max_limit][1];

		// a[total iterations][parameters]
		// a[3][1]
		// a[0][0] -> user1
		// a[1][0] -> user 2
		// a[2][0] -> user 3

		for (int i = 0; i < max_limit; i++) {
			UserBO user = new UserBO();
			user.setUsername(faker.name().fullName());
			user.setPassword(faker.internet().password());
			user.setEmail(faker.internet().emailAddress());
			object[i][0] = user;

			// return new Object[][] {{user},{user},{user}};
			// [3][1]

			// return new Object[][] { { "user1", "pass1","","","" }, { "user2",
			// "pass2","","","" }, { "user3", "pass3","","","" } };
			// [3][5]

		}
		return object;
	}

	@DataProvider(name = "reemData")
	public Object[][] getJsonData() {
		List<JsonObject> objectList = JsonReader_Reem.read();

		Object[][] object = new Object[objectList.size()][1];

		for (int i = 0; i < objectList.size(); i++) {

			object[i][0] = objectList.get(i);
		}

		return object;
	}

}
