
public class ThisDemo {
	public static void main(String[] args) {
		Employee emp = new Employee(121, "Abc",324534.34);
		System.out.println("id : " + emp.id);
		System.out.println("name : " + emp.name);
		System.out.println("salary : " + emp.salary);
	}
}
class Employee {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this(id,name); // calling a constructor of same class
		this.salary = salary; // access the instance variable of the same class
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name=name;
		this.demo(); // to access the method of same class
	}
	public void demo() {
		System.out.println("This is the demo method");
	}
}
