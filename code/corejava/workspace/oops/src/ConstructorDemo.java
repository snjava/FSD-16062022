public class ConstructorDemo {
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.print();
		System.out.println("==================");
		Student stud2 = new Student(121,"Xyz", "Mumbai", "5675675665");
		stud2.print();
		System.out.println("==================");
		Student stud3 = new Student(11, "Pqr", "9789789786");
		stud3.print();
	}
}

class Student {
	int id;
	String name;
	String city;
	String contact;
	
	public Student() { // no parameterized constructor
		id = 1;
		name= "NA";
		city = "Pune";
		contact = "NA";
	}
	
	public Student(int i, String n, String ct, String c) { // 4 parameterized constructor
		id = i;
		name = n;
		city = ct;
		contact = c;
	}
	
	public Student(int i, String n, String c) { // 3 parameterized constructor
		id = i;
		name = n;
		city = "Pune";
		contact = c;
	}
	
	public void print() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
		System.out.println("Contact : " + contact);
	}
}
