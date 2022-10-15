
public class StaticDemo1 {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "Nokia";
		System.out.println("Mobile -1 : " + m1.brand);
		
		Mobile m2 = new Mobile();
		System.out.println("Mobile -2 : " + m2.brand);
		
		Mobile m3 = new Mobile();
		System.out.println("Mobile -3 : " + m3.brand);
	}
}

class Mobile {
	int mobileRam; 
	static String brand = "i-Phone Apple";
	
	public static void getMobileBrand() {
		//System.out.println(this.mobileRam);
		System.out.println(brand);
	}
}
