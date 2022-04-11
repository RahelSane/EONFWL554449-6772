package java8;

interface Engine
{
	public static void display()
	{
		System.out.println("This is Java 8 Static Method");
	}
}

public class StaticMethod_InterfaceEnhancement_TrainClass implements Engine
{
	
	public static void main(String[] args)
	{
		Engine.display();

	}

}
