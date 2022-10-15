
public class SuperDemo {
	public static void main(String[] args) {
		Student st = new Student();
		st.print();
	}
}
class Person {
	int id = 11;
	String name;
	public Person() {
		System.out.println("Person class No parameter constructor");
		name ="NA";
	}
}
class Student extends Person {
	int id=111;
	String name;
	public Student() {
		super(); // to call super class constructor 
		System.out.println("Student class No parameter constructor");
		name ="Student Name NA";
	}
	public void print() {
		System.out.println("Person Id : " + super.id); // access the super class variable
		System.out.println("Person name : " + super.name);
		
		System.out.println("Student Id : " + id); 
		System.out.println("Student name : " + name);
	}
}