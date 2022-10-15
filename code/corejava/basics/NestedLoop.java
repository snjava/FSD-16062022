/**
	1 1 1 1
	2 2 2 2
	3 3 3 3
	4 4 4 4
	5 5 5 5
*/
public class NestedLoop
{
	public static void main(String arr[])
	{
		for (int i = 1 ; i<=5 ; i++) // rows
		{
			for(int j = 1 ; j<=4 ; j++) // columns
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}