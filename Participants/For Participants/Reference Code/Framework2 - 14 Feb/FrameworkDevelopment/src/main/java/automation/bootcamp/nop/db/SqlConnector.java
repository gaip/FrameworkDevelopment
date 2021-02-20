package automation.bootcamp.nop.db;

public class SqlConnector {

	private static SqlConnector connector;

	// cannot create object of this class
	private SqlConnector() {

	}

	// can access it outside
	public static SqlConnector getInstance() {
		if (connector == null || connector.isClosed()) {
			connector = new SqlConnector();
		}

		return connector;
	}

	// instance method
	public void createInstance() {

	}
}
