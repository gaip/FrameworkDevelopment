package automation.bootcamp.nop.db;

public class TestConnector {

	public static void main(String[] args) {
		SqlConnector connector = SqlConnector.getInstance();
		connector.createInstance();
	}
}
