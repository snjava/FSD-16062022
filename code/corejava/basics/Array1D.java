public class Array1D
{
	public static void main(String []arr)
	{
		/*
		double percent[]; // declaration of Array
		percent = new double[6];  // instance creation of array 
		percent[0] = 77.12; 
		percent[3] = 88.64;
		*/

		double percent[] = {77.28, 0.0, 88.66, 56.65, 77.88, 71.12};

		for(int i = 0 ; i<=5 ; i++) {
			System.out.println(percent[i]);
		}

		System.out.println(percent[0] + ", " + percent[3]);


		System.out.println("====================");
		int values[] = {43,54,65,56,34,65,87,76,54,76,98,56,53,75,97,86,45,56,87,86};
		
		System.out.println(values.length); // get the size of an array

		for(int i = 0 ; i <= values.length-1 ; i++ ) {
			System.out.println(values[i]);
		}

	}
}