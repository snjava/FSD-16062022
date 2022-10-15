/**
	This class is use to demo about a short circuit and increment/decrement
	operation
*/
public class Operator4
{
	public static void main(String ar[])
	{
		
		int a = 10;
		System.out.println(a>10 & a<=50); // false
		System.out.println(a>10 && a<=50);// false
	
	//================================================
		int x = 5;
		++x; // pre increment // x = x + 1;
		x++; // post inrement // x = x + 1;
		System.out.println(x); // 7

		int i = 6;
		int j = ++i; // first assign value and then decrement the value
		System.out.println(i); // 7
		System.out.println(j); // 7
	}
}