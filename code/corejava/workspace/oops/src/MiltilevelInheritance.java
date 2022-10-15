
public class MiltilevelInheritance {
	public static void main(String[] args) {
		AudiA8 obj = new AudiA8();
		
		System.out.println(obj.toString());
		
		System.out.println("c :" + obj.c);
		System.out.println("b :" + obj.b);
		System.out.println("a :" + obj.a);
	}
}
class Vehicle {
	int a = 10;
}

// Audi IS-A Vehicle
class Audi extends Vehicle {
	int b =20;
}

// AudiA8 IS-A Audi
class AudiA8 extends Audi {
	int c = 30;
}
