import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {
		int values[]= {34,56,78,0,12,5,0,12};
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter 1st Index : ");
			int index1 = scan.nextInt();
			System.out.println("Enter 2nd Index : ");
			int index2 = scan.nextInt();
			
			int val1 = values[index1];
			int val2 = values[index2];
			
			try {
				System.out.println("Div : " + (val1 / val2));
			}
			catch(ArithmeticException e) {
				System.out.println("Cannot Divide by Zero...");
			}
			System.out.println("Mul : " + (val1 * val2));
			System.out.println("Sub : " + (val1 - val2));
			System.out.println("Add : " + (val1 + val2));
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter Valid Input...");
		}
		catch(RuntimeException e) {
			System.out.println("Somting went wrong...");
		}
		finally {
			scan.close();
		}	
	}

}
