package institute.student;

public class StudentDetails {

	private int id;
	public String name;
	String address;
	public String contact;
	
	public void studProgress() {
		System.out.println("Student Progress....");
	}
	
}


class StudentBatch extends StudentDetails {
	public void studDetailsByObject() {
		StudentDetails dtl = new StudentDetails();
		System.out.println(dtl.name);
		System.out.println(dtl.address);
		System.out.println(dtl.contact);
		
	}
	
	public void studDetailsByInheritance() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(contact);
	}
}