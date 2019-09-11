package FunctionalProgram;
import java.util.Scanner;

public class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		int n=year;
		int digit=0;
		int temp;
		while(n>0)
		{
			temp=n%10;
			digit++;
			n=n/10;
		}
		if(digit==4)
		{
			if(year%4==0 || year%400==0)
			{
				System.out.println("the given year is leap year:"+year);
			}
			else
			{
				System.out.println("this is not leap year");
			}
		}
		else
		{
			System.out.println("invalid year beause year is not a 4 digit");
		}
	}
}
