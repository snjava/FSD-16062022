public class Calculation
{
	public static void main(String args[])
	{
		System.out.println("This is Main Method");
		Calculation calculate = new Calculation(); // Object
		calculate.add(); // method call
		calculate.sub(23,12);
		int result1 = calculate.div();
		//System.out.println("Division : " + result1);
		int result2 = calculate.mul(result1,3);
		System.out.println("Multiplication : " + result2);
	}

	public void add()
	{
		int a = 10;
		int b = 30;
		int ans = a + b;
		System.out.println("Addition : " + ans);
	}

	// create a method which accept 2 int values and print the sub of those
	public void sub(int a, int b)
	{
		int ans = a-b;
		System.out.println("Substraction : " + ans);
	}

	//create a method which return the division of the 2 values
	public int div()
	{
		int a = 20;
		int b = 2;
		int ans = a/b;
		System.out.println("Division : " + ans);
		return ans;
	}

	public int mul(int a, int b) 
	{
		int ans = a * b;
		return ans;
	}	 

}



