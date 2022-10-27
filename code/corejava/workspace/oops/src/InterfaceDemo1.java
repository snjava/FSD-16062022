
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Vehical vehical = new Fortuner();
		vehical.brandName();
		vehical.fualType();
		vehical.noOfWheels();
	}
}
interface Vehical {
	public void brandName();
	public void fualType();
	public void noOfWheels();
}

abstract class Car1 implements Vehical {
	public void noOfWheels() {
		System.out.println("4 Wheels");
	}
}

abstract class Bike implements Vehical {
	public void noOfWheels() {
		System.out.println("2 Wheels");
	}
}

class Fortuner extends Car1 {
	public void brandName() {
		System.out.println("Brand : Toyota");
	}
	public void fualType() {
		System.out.println("Fual Type : Diesal");
	}
}








