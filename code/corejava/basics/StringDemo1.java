public class StringDemo1
{
	public static void main(String arr[])
	{
		String str1 = "Hello Java";
		String str2 = new String("Hello Java");
		String str3 = "Hello Java";
		String str4 = new String("Hello Java");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	
		System.out.println(str1 == str2); // false
		System.out.println(str1 == str3); // true
		System.out.println(str2 == str4); // false

	}
}