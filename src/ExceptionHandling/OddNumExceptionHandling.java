package ExceptionHandling;

class CheckDemo
{
	public static void checkNum(int x)
	{
		if(x%2==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}

public class OddNumExceptionHandling 
{

	public static void main(String[] args)
	{
		try
		{
			CheckDemo.checkNum(3);
		}
		catch( ArithmeticException e)
		{
			System.out.println("Error.......");
		}

	}

}
