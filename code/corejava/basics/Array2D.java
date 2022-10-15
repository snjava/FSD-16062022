public class Array2D
{
	public static void main(String arr[])
	{
		//first bracket is always for ROW and 2nd is for COLUMN
		/*
		double percent[][]; // declaration of variable 
		percent = new double[4][6]; // Instance Creation
		percent[0][2] = 77.23;  // initialization  of array
		percent[2][4] = 81.2;
		*/

		double percent[][] = new double[][] { 
												{56, 67, 56, 67, 87, 67}, 
												{56, 68, 45, 28, 34, 87}, 
												{84, 75, 87, 34, 81, 34}, 
												{76, 87, 98, 89, 35, 23} 
       										  };

		System.out.println(percent.length);  // 4
		System.out.println(percent[2].length); // 6
		System.out.println(percent[3][2]); // 98

		System.out.println("=============");


		for(int r = 0 ; r<4 ; r++)  // row
		{
			for(int c = 0 ; c<6 ; c++)  // column
			{
				System.out.print(percent[r][c] + "\t");
			}
			System.out.println();
		}
	}
}