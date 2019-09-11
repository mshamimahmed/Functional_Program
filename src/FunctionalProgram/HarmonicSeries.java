package FunctionalProgram;
import java.util.Scanner;
public class HarmonicSeries
{
	public static void main(String[] args) 
	{
		double harmonic=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Harmonic number for:");
		int n=sc.nextInt();
		for(double i=1;i<=n;i++)
		{
			harmonic=harmonic + 1/i;
			System.out.println("harmonic number for "+i+ " is "+harmonic);
		}
		System.out.println("the last harmonic number is "+harmonic);
		sc.close();
	}
}
