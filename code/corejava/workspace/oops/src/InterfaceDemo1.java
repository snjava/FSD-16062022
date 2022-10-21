
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

class Fortuner implements Vehical {
	public void brandName() {
		System.out.println("Brand : Toyota");
	}
	public void fualType() {
		System.out.println("Fual Type : Diesal");
	}
	public void noOfWheels() {
		System.out.println("4 Wheels");
	}
}








