package bootcamp.test.filereaders.excelreader;

public class TestcaseBO {

	private String name;
	private String pageName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	@Override
	public String toString() {
		return "TestcaseBO [name=" + name + ", pageName=" + pageName + "]";
	}
}
