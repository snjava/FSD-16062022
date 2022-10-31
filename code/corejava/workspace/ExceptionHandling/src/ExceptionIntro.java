import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIntro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter 1st Num : ");
			int num1 = scan.nextInt();
			System.out.println("Enter 2nd Num : ");
			int num2 = scan.nextInt();
			
			System.out.println("Division : " + (num1/num2));
		}
		catch(InputMismatchException ex) {
			System.out.println("Please enter valid Number....");
		}
		
		scan.close();
		
		System.out.println("End of main program....");
		
	}

}
