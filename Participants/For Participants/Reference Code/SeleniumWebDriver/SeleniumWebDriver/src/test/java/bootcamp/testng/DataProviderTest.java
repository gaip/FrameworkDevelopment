package bootcamp.testng;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import bootcamp.test.UserBO;

public class DataProviderTest {

	@Test(dataProvider = "loginData", dataProviderClass = BaseTest.class)
	public void login(UserBO user) {
		System.out.println("Username: " + user.getUsername());
		System.out.println("Password: " + user.getPassword());
		//System.out.println("Password: " + user.getEmail());
	}

	@Test(dataProvider = "reemData", dataProviderClass = BaseTest.class)
	public void reemDataTest(JsonObject jsonObject) {
		System.out.println(jsonObject.get("email"));
	}
}