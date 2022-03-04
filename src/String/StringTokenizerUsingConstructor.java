package String;

import java.util.StringTokenizer;

public class StringTokenizerUsingConstructor 
{

	public static void main(String[] args)
	{
			System.out.println("***** Using Constructor 1 *****");
		
		StringTokenizer st1 = new StringTokenizer("Welcome To The World Of Java"," ");
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
		}
		
			System.out.println("***** Using Constructor 2 *****");
		
		StringTokenizer st2 = new StringTokenizer("Rahel:Rajesh:Sane",":");
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}
		
			System.out.println("***** Using Constructor 3 *****");
		
		StringTokenizer st3 = new StringTokenizer("Rahel:Rajesh:Sane",":",true);
		while(st3.hasMoreTokens())
		{
			System.out.println(st3.nextToken());
		}
		
	}

}
