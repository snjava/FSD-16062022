public class StringDemo3
{
	public static void main(String arr[])
	{
		String s1 = "Welcome";
		String s2 = "";
		System.out.println("Original Value : " + s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s2.isEmpty());
		System.out.println(s1.charAt(4)); // to check character on specified index
		System.out.println(s1.indexOf('e'));// to get the first index of specified charater
		System.out.println(s1.lastIndexOf('e'));// to get the last index of specified charater

		String s3 = " Java";

		System.out.println(s1.indexOf('e'));// to get the first index of specified charater
		System.out.println(s1.concat(s3)); // to join first string with the 2nd string
		System.out.println(s1 + s3); // to join first string with the 2nd string

		String s4 = "profilepic.jpeg";
		System.out.println(s4.endsWith(".jpeg")); // check whether spring is ending with specified value

		char[] ch = s4.toCharArray();
		for(char c : ch)
		{
			System.out.println(c);
		}
		
		System.out.println("Original Value : " + s1);


		String name = "Atul-Sachin-Patil";
		String str[] = name.split("-");
		System.out.println("First Name :" + str[0]);
		System.out.println("Middle Name :" + str[1]);
		System.out.println("Last Name :" + str[2]);








	}
}