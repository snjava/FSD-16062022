
// Custom Exception
public class NoAccessException extends Exception {
	public void printMessage() {
		System.out.println("Need Access to complete the Task...");
	}
}
