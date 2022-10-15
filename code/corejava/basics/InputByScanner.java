import java.util.Scanner;
public class InputByScanner
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Enter Name : ");
		String name = scan.next();
		
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		
		System.out.println("Enter Salary : ");
		double sal = scan.nextDouble();
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + sal);
		
		int birthYear = 2022 - age;
		System.out.println("Your Birth year is : "+ birthYear);
		
		scan.close();
	}
}