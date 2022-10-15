public class StringBuilderDemo1
{
	public static void main(String arr[])
	{
		StringBuilder sbr = new StringBuilder("Hello");
		System.out.println("Original Value : "+sbr);

		sbr.append(" java");
		System.out.println("After Append : "+sbr);

		sbr.insert(5, " program in");
		System.out.println("After insert : "+sbr);

		System.out.println("length : "+sbr.length());

		sbr.replace(6,13, "StringBuilder");
		System.out.println("After replace : "+sbr);

		sbr.reverse();
		System.out.println("After reverse : "+sbr);
	}
} 