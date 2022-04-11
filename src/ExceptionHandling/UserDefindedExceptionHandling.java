package ExceptionHandling;

class MyOwnException extends Exception
{
	public MyOwnException(String msg)
	{
		super(msg);
	}
}
class UserDefindedExceptionHandling
{
	static void employeeAge(int age) throws MyOwnException
	{
		if(age<0)
		{
			MyOwnException obj = new MyOwnException("Age cant be less than Zero");
			throw obj;
		}
		else
		{
			System.out.println("Input is Valid");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			employeeAge(2);
		}
		catch(MyOwnException e)
		{
			e.printStackTrace();
		}
	}

}
