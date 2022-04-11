package ExceptionHandling;

import java.util.Scanner;

public class TryCatchFinallyProgram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 2 Numbers");
		int x=0;
		int y=0;
		
		try
		{
			x=sc.nextInt();
			y=sc.nextInt();
			int res=x/y;
			System.out.println("Division :"+res);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("You Enter Zero .....");
		}
		
		catch(Exception w)  // Catch all Block
		{
			System.out.println("Error .....");
		}
		
		finally  //always execute
		{
			System.out.println("Always Execute.....");
		}
		
		int r=x+y;
		System.out.println("Addition is "+r);
	}

}
