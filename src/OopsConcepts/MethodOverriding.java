package OopsConcepts;

class Animal3
{
	int z;
	public Animal3(int c)
	{
		System.out.println("This is the Constructor ");
	}
	public void move()
	{
		System.out.println("Animal Can Move \t"+z);
	}
}

class Dog3 extends Animal3
{
	public Dog3(int x,int y)
	{
		super(x);
		super.z=88;
		System.out.println(x+ "\tDerived Class Constructor\t" +y);
	}
	public void move()
	{
		super.move();
		System.out.println("Dog Can Walk & Run ");
	}
}

public class MethodOverriding 
{
	public static void main(String[] args)
	{
		Dog3 obj = new Dog3(11,22);
		obj.move();

	}

}
