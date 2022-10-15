public class VariableCasting
{
	public static void main(String args[])
	{
		byte a = 10;
		int b = a; // implicit casting

		System.out.println(a);
		System.out.println(b);


		int x = 130;
		byte y = (byte) x; // explicit casting

		System.out.println(x);
		System.out.println(y);
	}
}