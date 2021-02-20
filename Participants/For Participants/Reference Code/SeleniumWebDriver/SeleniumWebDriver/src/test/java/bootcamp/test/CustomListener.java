package bootcamp.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting Test: " + result.getMethod().getMethodName());
	}
}
