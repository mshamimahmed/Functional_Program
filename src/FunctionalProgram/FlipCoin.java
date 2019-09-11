package FunctionalProgram;
import java.util.Scanner;
import java.util.Random;
public class FlipCoin 
{
	public static void main(String[] args) 
	{
		int toss,heads,tails;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the toss:");
		toss=sc.nextInt();
		Random r= new Random();		

		heads=0;
		tails=0;
		int counter=0;
		while(toss>counter)
		{
			
			if(Math.random()<0.5)
			{
				heads++;
			}
			else
			{
				tails++;
			}
			counter++;

		}
		System.out.println("number of head is:"+heads);
		System.out.println("number of tails is:"+ tails);
		System.out.println("head Perentage is:"+(100*heads/toss));
		System.out.println("head Perentage is:"+(100*tails/toss));
		
	}
}
