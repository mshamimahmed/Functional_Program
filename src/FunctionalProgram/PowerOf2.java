package FunctionalProgram;
import java.util.Scanner;

public class PowerOf2
{
	public static boolean leapYear(double b)
	{
		if(b%4==0 || b%400==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String args[])
	{
		double b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N number:");
		double N = sc.nextInt();
		
			if(N>=0 && N<=31)
			{
				for(double i=1;i<=N;i++)
				{
				b= Math.pow(2, i);
				System.out.println(" power "+i+ " is :"+b);
				System.out.println("leap year "+leapYear(b));
				}
			}
			else
			{
				System.out.println("invalid N value,please enter the value in beetween 0 and 31");
			}		
	}
}
