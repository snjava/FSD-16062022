/**
	percent is between 75-100 -> Dist
	percent is between 60-75 -> 1st
	percent is between 50-60 -> 2nd
	percent is between 40-50 -> pass
	percent is between 0-40 -> Fail
*/


class IfDemo1
{
	public static void main(String arr[])
	{
		
		int percent = 62;
		if(percent >= 40 && percent <= 100)
		{
			System.out.println("You are pass..."); // 40-100
			if(percent>=75 && percent<=100)
			{
				System.out.println("Congrats!! You got an Distenction..");
			}
			else if(percent>=60 && percent<75)
			{
				System.out.println("Congrats!! You got a 1st class..");
			}
			else if(percent>=50 && percent<60)
			{
				System.out.println("Congrats!! You got a 2nd class..");
			}
			else
			{
				System.out.println("Congrats!! You got a pass class..");
			}

		}
		else if(percent>=0 && percent<40)
		{
			System.out.println("You are Fail..."); // 0-40
		}
		else 
		{
			System.out.println("Invalid Percentage...");
		}
	}
}

