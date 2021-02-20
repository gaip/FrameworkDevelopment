package bootcamp.testng;

public interface ITest {

	void start();
	
	void end();
	
	void fail();
	
	default void success() {
		System.out.println("Test pass");
	}
}
