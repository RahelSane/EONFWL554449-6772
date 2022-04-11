package java8;

interface Engine33
{
	abstract public void speed();
}

class Car33
{
	public Car33()
	{
		System.out.println("This is Constructor of Car");
	}
}

public class Reference_To_Constructor 
{

	public static void main(String[] args) 
	{
		//Using Labda Expression
		Engine33 obj1=()->System.out.println("Speed is Good");
		obj1.speed();
		
		//Lambda Repalced with Instance Method Reference
		Engine33 obj2 = Car33::new;
		obj2.speed();

	}

}
