
public class AbstractDemo2 {
	public static void main(String[] args) {
		Z obj = new Z();
	}
}

class Z extends X {
	public void m1() {
		
	}
}

abstract class X {
	public X() {
		System.out.println("Abstract Class Constructor");
	}
	public abstract void m1();
	public static final void m2() {
		
	}
}

abstract class Y extends X {
	
}