package institute.teacher;

//import institute.student.*; // all the classes from the student package
import institute.student.StudentDetails; // single class from the student package
import java.util.Scanner;

public class TeachDetails {

	public static void main(String[] args) {
		TeachDetails dtl = new TeachDetails();
		dtl.getStudDtl();
		
		Scanner scan = new Scanner(System.in);
	}
	
	public void getStudDtl() {
		StudentDetails studDtl = new StudentDetails();
		System.out.println(studDtl.name);
		System.out.println(studDtl.contact);
		
		studDtl.studProgress();
	}

}
