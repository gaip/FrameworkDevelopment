package bootcamp.selenium.advance.file.excel;

public class TestcaseBO {

	private String testcaseName;
	private String moduleName;
	private String smoke;
	private String sanity;
	private String regression;

	public String getTestcaseName() {
		return testcaseName;
	}

	public void setTestcaseName(String testcaseName) {
		this.testcaseName = testcaseName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getSmoke() {
		return smoke;
	}

	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}

	public String getSanity() {
		return sanity;
	}

	public void setSanity(String sanity) {
		this.sanity = sanity;
	}

	public String getRegression() {
		return regression;
	}

	public void setRegression(String regression) {
		this.regression = regression;
	}

	@Override
	public String toString() {
		return "TestcaseBO [testcaseName=" + testcaseName + ", moduleName=" + moduleName + ", smoke=" + smoke
				+ ", sanity=" + sanity + ", regression=" + regression + "]";
	}
}
