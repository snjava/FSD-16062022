
public class StaticDemo {
	public static void main(String[] args) {
		System.out.println("Company Name : " + Company.name);
		System.out.println("Company Name : " + Company.getName());
	}
}


class Company {
	static String name = "Abc Pvt.Ltd."; // static variable
	
	public static String getName() { // static method
		return name;
	}
}
