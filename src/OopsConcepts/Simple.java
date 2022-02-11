package OopsConcepts;

public class Simple 
{
	public void Demo()
	{
		System.out.println("Welcome To The World Of JAVA");
	}
	public int Addition(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		Simple obj=new Simple();
		obj.Demo();
		System.out.println("Addition of a & b is :"+obj.Addition(5,5));
		

	}

}