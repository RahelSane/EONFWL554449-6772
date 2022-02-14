package OopsConcepts;

class Animal1
{
	public void move()
	{
		System.out.println("Animal Can Move ");
	}
}

class Dog1 extends Animal1
{
	public void move()
	{
		//super.move(); using super keyword chlid class and parent class methods will be call or print 
		System.out.println("Dog Can Move & Run ");
	}
}

public class Polymorphism_MethodOverriding
{
	public static void main(String[] args)
	{
		Dog1 obj = new Dog1();
		obj.move();
	}

}
