
public class UsingCustomException {

	public static void main(String[] args) {
		try {
			test();
		} catch(NoAccessException ex) {
			ex.printMessage();
		}
	}

	
	public static void test() throws NoAccessException{
		throw new NoAccessException();
	}
	
}
