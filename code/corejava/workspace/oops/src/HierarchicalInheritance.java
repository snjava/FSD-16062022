
public class HierarchicalInheritance {
	public static void main(String[] args) {
		C1 obj1 = new C2();
		C1 obj2 = new C3();
		obj1.m();
		obj2.m();
	}
}

class C1 {
	public void m() {
		System.out.println("This is C1");
	}
}

class C2 extends C1 {
	public void m() {
		System.out.println("This is C2");
	}
}

class C3 extends C1 {
	public void m() {
		System.out.println("This is C3");
	}
}