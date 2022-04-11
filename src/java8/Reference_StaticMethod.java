package java8;

interface Engine11
{
	abstract public void speed();
}

class Car11
{
	public static void average() 
	{
		System.out.println("The Average of the car is Very Good ");
	}
}


public class Reference_StaticMethod
{

	public static void main(String[] args) 
	{
		//Using Lambda Expression
		Engine11 obj1 = () -> System.out.println("Speed is Good");
		obj1.speed();
		
		//Lambda Replaced with Static Method Reference
		Engine11 obj2 = Car11::average;
		obj2.speed();
		
	}

}
