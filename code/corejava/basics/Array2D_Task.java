public class Array2D_Task
{
	public static void main(String ar[])
	{
		int marks[][] = {
			{87,67,87,98,67},
			{78,89,65,79,78},
			{76,87,89,54,56},
			{72,83,84,56,77}
		};

		double highestPercent = 0.0;
		for(int r = 0 ; r<marks.length ; r++) 
		{
			int sum = 0;
			for(int c = 0 ; c<marks[r].length ; c++)
			{
				sum += marks[r][c];
				System.out.print(marks[r][c] +"\t");
			}
			double percent = (sum/5);
			System.out.println(" = "+ percent);

			if(percent > highestPercent) {
				highestPercent = percent;
			}
		}
		System.out.println(" Highest Percent "+ highestPercent);
	}
}