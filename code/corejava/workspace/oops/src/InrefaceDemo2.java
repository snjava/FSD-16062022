public class InrefaceDemo2 {
	public static void main(String[] args) {

	}
}

interface Inter1 {
	void m1();
}

interface Inter2 {
	void m2();
}

// multiple inheritance
interface Inter3 extends Inter1, Inter2 {
	void m3();
}

//multiple inheritance
abstract class Cls1 implements Inter1, Inter2 {
}

//multiple inheritance
abstract class Cls2 extends Cls1 implements Inter3 {
	
}



