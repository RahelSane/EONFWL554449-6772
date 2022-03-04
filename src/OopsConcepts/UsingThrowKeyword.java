package OopsConcepts;

public class UsingThrowKeyword 
{
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Access denied - You must at least 18 years Old.");
		}
		else
		{
			System.out.println("Access Granted - You are old Enough!!");
		}
	}
	public static void main(String[] args)
	{
		checkAge(15);

	}

}
