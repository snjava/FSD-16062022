import java.util.Scanner;

public class ExceptionIntro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Num : ");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd Num : ");
		int num2 = scan.nextInt();
		
		System.out.println("Division : " + (num1/num2));
		
		scan.close();
		
		System.out.println("End of main program....");
		
	}

}
