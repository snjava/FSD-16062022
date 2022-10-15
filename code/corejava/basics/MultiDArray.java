public class MultiDArray
{
	public static void main(String arrgs[])
	{
		int marks[][] = {
			{87, 67, 87},
			{79, 78},
			{87, 89, 54, 56},
			{72, 83, 84, 56, 77}
		};

		for(int r = 0 ; r<marks.length ; r++) {
			for(int c = 0 ; c<marks[r].length ; c++) {
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}

	}
}