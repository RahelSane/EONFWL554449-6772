package Polymorphism;

class Animal
{
	public Animal()
	{
		System.out.println("This is Animal Class Constructor ");
	}
	public void move()
	{
		System.out.println("Animal Can Move ");
	}
}

class Dog extends Animal
{
	public Dog(int x)
	{
		System.out.println("This is Dog Class Constructor "+x);
	}
	public void move()
	{
		super.move();
		System.out.println("Dog Can Move & Run ");
	}
}

public class MethodOverriding_UsingConstructor 
{

	public static void main(String[] args)
	{
		Dog obj = new Dog(20);
		obj.move();
	}

}
