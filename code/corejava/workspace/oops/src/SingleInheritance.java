
public class SingleInheritance {
	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.id = 121;
		dev.name = "Abc";
		dev.email = "abc@gmail.com";
		dev.skills = "Java";
		
		dev.printDevInfo();
	}
}

class Person {
	String name;
	String email;
	public void printPerson() {
		System.out.println("name : " + name);
		System.out.println("email : " + email);
	}
}

// Developer IS-A Person
class Developer extends Person {
	int id;
	String skills;
	
	public void printDevInfo() {
		System.out.println("id : " + id);
		printPerson();
		System.out.println("Skills : " + skills);
	}
	
}
