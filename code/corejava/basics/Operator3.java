public class Operator3
{
	public static void main(String ar[])
	{
		int a = 60;

		// a grater than 1 (a>1) and Less than 50 (a<50)
		System.out.println(a>1 & a<50); // true & false = false
		System.out.println(a>1 | a<50); // true | false = true
		System.out.println(!(a>1)); // false	

		int x = 5;
		int y = 10;
		System.out.println(x | y); // 15
		System.out.println(x & y); // 0

	
	}
}