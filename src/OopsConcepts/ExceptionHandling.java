package OopsConcepts;

public class ExceptionHandling 
{
	public void show()
	{
		try
		{
			System.out.println("*****Hello*****");
			
			int a=10;
			int b=a/10;
			
			System.out.println("My Name is Rahel Sane");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured"+e);
		}
	}
	public void display()
	{
		System.out.println("My Name Is Rahel Rajesh Sane");
	}
	
	public static void main(String[] args) 
	{
		ExceptionHandling obj = new ExceptionHandling();
		obj.show();
		obj.display();

	}

}
