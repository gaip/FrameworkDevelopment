package automation.bootcamp.nop.utilities;

import automation.bootcamp.nop.bo.LoginBo;
import automation.bootcamp.nop.file.reader.PropertyReader;

public class LoginUtils {

	public static LoginBo getLoginCredentials(String type) {

		// fetch from list based on user type
		
		LoginBo login = new LoginBo();
		login.setPassword(PropertyReader.getProperty(type + "_user"));
		login.setUsername(PropertyReader.getProperty("defaultUsername"));
		return login;
	}

	// login -> submitter role

	// submit data

	// logout

	// login approval -> approver Role

	// approver or reject

	// logout

	// submitter user

	// status of the application
}
