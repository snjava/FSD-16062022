public class CommandLineArgs
{
	public static void main(String args[])
	{
		String name = args[0];
		String age = args[1];
		
		int ag = Integer.parseInt(age);
		
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		
		int birthYear = 2022 - ag;
		
		System.out.println("Your Birth year is : "+ birthYear);
	}
}