package OopsConcepts;

public class ExceptionDemo
{
	public void input()
	{
		try
		{
			System.out.println("This is Input Method");
			int a=10;
			int b=a/0;  //try throw the Exception Object
			System.out.println("Hello");
		}
		catch(Exception e)  // Here e object catch the Exception Object
		{
			System.out.println("Exception is Generated"+e);
		}
	}
	public void output()
	{
		System.out.println("This is Output Method");
	}
	public void show1()
	{
		System.out.println("This is Show1 Method");
	}
	public void show2()
	{
		System.out.println("This is Show2 Method");
	}
	public static void main(String[] args) 
	{
		ExceptionDemo obj = new ExceptionDemo();
		obj.input();
		obj.output();
		obj.show1();
		obj.show2();

	}

}
