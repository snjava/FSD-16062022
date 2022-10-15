/**
	day == 1 then print Monday
	day == 2 then print Tuesday
	day == 3 then print Wednesday
	day == 4 then print Thursday
	day == 5 then print Friday
	day == 6 then print Saturday
	day == 7 then print Sunday
*/

class IfDemo2
{
	public static void main(String arr[])
	{
		int day = 8;
		if(day == 1)
		{
			System.out.println("Monday");
		}
		else if(day == 2)
		{
			System.out.println("Tuesday");
		}
		else if(day == 3)
		{
			System.out.println("Wednesday");
		}
		else if(day == 4)
		{
			System.out.println("Thursday");
		}
		else if(day == 5)
		{
			System.out.println("Friday");
		}
		else if(day == 6)
		{
			System.out.println("Saturday");
		}
		else if(day == 7)
		{
			System.out.println("Sunday");
		}
		else 
		{
			System.out.println("Invalid Day..");
		}
	}
}