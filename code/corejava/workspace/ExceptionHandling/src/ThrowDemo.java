
public class ThrowDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmployeeDetails(121, "Abc", 34534.34);
		emp.printEmployeeDetails();
	}
}

// If id is in negative then throw IllegalArgumentException
class Employee {
	private int id;
	private String name;
	private double salary;
	
	public void setEmployeeDetails(int id, String name, double salary) {
		
		try {
			if(id < 0) { // Exception Scenario Identify
				// Creating Object of Exception and Throwing it manually.
				throw new IllegalArgumentException("Employee Id Must not be negative");
			} else {
				this.id = id;
			}
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			id = 0;
		}
		this.name = name;
		this.salary = salary;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
}
