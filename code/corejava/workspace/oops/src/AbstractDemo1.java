
public class AbstractDemo1 {
	public static void main(String[] args) {
		Car car = new Xuv700();
		car.brandName();
		car.fualType();
		car.noOfWheels();
		
	}
}


abstract class Car {
	public abstract void brandName();
	public abstract void fualType();
	public void noOfWheels() {
		System.out.println("Car has 4 wheels...");
	}
}

class Xuv700 extends Car {
	public void brandName() {
		System.out.println("Brand :  Mahendra");
	}
	public void fualType() {
		System.out.println("Fual Type : Diesel");
	}
}