public class EnhanceForLoop
{
	public static void main(String arrgs[])
	{
		int arr[] = {234,45,56,12,32,56,56,5643};
55
		System.out.println("====for Loop===");
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("====enhance for Loop===");
		for(int val : arr) {
			System.out.println(val);
		}

	}
}