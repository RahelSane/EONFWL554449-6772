package OopsConcepts;


interface Movable
{
	public default void move()
	{
		System.out.println("Moving Ball");
	}
}

class Car
{
	public void move()
	{
		System.out.println("This is Class Method");
	}
}

 public class InterfaceUsingDefault extends Car implements Movable
{
	public void move()
	{
		
		System.out.println("Moving Car");
		Movable.super.move();
	}

	public static void main(String[] args) 
	{
		
		InterfaceUsingDefault obj = new InterfaceUsingDefault();
		obj.move();
		
	}

}
