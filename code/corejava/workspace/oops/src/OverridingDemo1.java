
public class OverridingDemo1 {
	public static void main(String[] args) {
		PersonIntro person = new PersonIntro();
		DeveloperIntro dev = new DeveloperIntro();
		TesterIntro test = new TesterIntro(); 
		
		printIntro(person);
		printIntro(dev);
		printIntro(test);
	}
	
	public static void printIntro(PersonIntro person) {
		person.intro();
	}
	
}

class PersonIntro {
	public void intro() {
		System.out.println("Hello, I am Person");
	}
}
class DeveloperIntro extends PersonIntro{
	public void intro () {
		System.out.println("Hello, I am Software Developer..");
	}
}
class TesterIntro extends PersonIntro{
	public void intro () {
		System.out.println("Hello, I am Software Tester..");
	}
}