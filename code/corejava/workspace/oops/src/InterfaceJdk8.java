import java.io.Serializable;

public class InterfaceJdk8 implements Serializable {

}

@FunctionalInterface
interface Inter {
	void m1();
	public default void m2() {
		System.out.println("This is the default method.");
	}
	public static void m3() {
		System.out.println("This is static method.");
	}
}


