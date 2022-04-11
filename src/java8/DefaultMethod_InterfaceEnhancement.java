package java8;

interface TestInterface
{
	public void square(int a); //abstract method
	
	default void show() //default method
	{
		System.out.println("Default Method Executed");
	}
}

public class DefaultMethod_InterfaceEnhancement implements TestInterface
{

	@Override
	public void square(int a)
	{
		System.out.println(a*a);
		
	}

	public static void main(String[] args) 
	{
		DefaultMethod_InterfaceEnhancement obj = new DefaultMethod_InterfaceEnhancement();
		obj.square(4);  //default method executed
		
		obj.show();

	}

}
