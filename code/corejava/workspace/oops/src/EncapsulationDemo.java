public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(121);
		e.setName("Abc");
		e.setSalary(-34534.34);
		e.printDetails();
	}
}

// bean, pojo, entity, model, dto(data transfer object)
class Employee {
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void printDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
}

