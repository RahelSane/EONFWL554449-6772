package OopsConcepts;

class Person2
{
	
	int age1; //instance variable,variable,data member,field
	
	public void input() //Member Function, Method, Function
	{
		System.out.println("\n Age of the person is: "+age1);
	}
	
	public void show(int x,double y)
	{
		System.out.println("\n Value of X is: "+x);
		System.out.println("\n Value of Y is: "+y);
	}
	
	public int mult(int p,int q)
	{
		System.out.println("\n Multiplication is :");
		return p*q;
		
	}
}

public class Person 
{

	public static void main(String[] args)
	{
		
		Person2 obj=new Person2();
		obj.age1=40;
		obj.input();
		obj.show(10, 4.3);
		System.out.println(obj.mult(50,50));
	
		
	}

}
