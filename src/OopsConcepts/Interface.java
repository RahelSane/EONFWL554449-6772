package OopsConcepts;

interface Test
{
	final int d=22;
	abstract public int area();
	abstract public int volume();
}
 
interface Test2
{
	final int d=25;
	public int area2();
}
class A
{
	public void input()
	{
		System.out.println("This is an Input Method");
	}
	
	public void output()
	{
		System.out.println("This is an Output Method");
	}
	
}
public class Interface extends A implements Test,Test2
{
	int i,j;
	public int area()
	{
		i=10;
		j=9;
		return i*j;
	}
	public int volume()
	{
		System.out.println("Value of d in test interface"+Test.d);
		System.out.println("Value of d in test interface"+Test2.d);
		return (i*j*22);
	}
	public int area2()
	{
		System.out.println("Area-2 is a method of Test-2 Interface");
		return i*j;
	}

	public static void main(String[] args) 
	{
		Interface obj=new Interface();
		obj.input();
		obj.output();
		obj.area();
		obj.volume();
		obj.area2();

		
	}

}
