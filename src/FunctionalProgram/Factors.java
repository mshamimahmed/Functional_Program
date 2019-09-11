package FunctionalProgram;

import java.util.Scanner;

public class Factors
{
	public static void primeFactor(int num)
	{
		while(num%2==0)
		{
			System.out.println(2+ " ");
			num=num/2;
		}
		for(int i=3;i<=Math.sqrt(num);i=i+2)
		{
			while(num%i==0)
			{
				System.out.println(i+" ");
				num/=i;
			}
		}
		if(num>2)
		{
			System.out.println(num);
		}
	
	}
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n:");
		num=sc.nextInt();
		primeFactor(num);
//		System.out.println(primeFactor(num));
		sc.close();
	}
}
