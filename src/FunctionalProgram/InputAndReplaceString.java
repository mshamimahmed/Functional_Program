package FunctionalProgram;
import java.util.Scanner;
import java.util.regex.*;
public class InputAndReplaceString 
{
	static boolean validateuser(String usrname)
	{
		String valid= "[a-zA-Z0-9]{3,20}";
		return (usrname !=null )&& usrname.matches(valid);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str= "Hello <<UserName>>,How are you?";
		System.out.println(str);
		System.out.println("enter the username to change it:");
		String usrname=sc.nextLine();
//		String username= validateuser(usrname);
		if(validateuser(usrname)== true)
		{
			String username = usrname;
			String str1=str.replace("<<UserName>>",username);
			System.out.println(str1);
		}
		else
		{
			System.out.println("input value is not valid");
		}
		sc.close();
	}
}
