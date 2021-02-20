package bootcamp.testng;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {
	
	List<teacase> 
	
	// iteartion
	// /jira?name=&desc=

	@Override
	public void onTestStart(ITestResult result) {
		// launch browser
		//testcase.add(resu.method)
		syso 
		
		// executionlist sotrage
		class.store(RandomStringUtils.getMethodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test Executed Successfully:: " + result.getMethod().getMethodName());
		log.info("")
	}

	public void onTestFailure(ITestResult result) {
		
	}
}
