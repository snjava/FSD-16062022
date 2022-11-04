
public class ThrowsExample {

	public static void main(String[] args) {
		ThrowsExample te = new ThrowsExample();
		te.m1();
	}
	
	public void m1() {
		m2();
	}
	
	public void m2() {
		m3();
	}
	
	public void m3() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.println(10/0);
	}
}
