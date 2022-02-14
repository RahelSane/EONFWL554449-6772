package OopsConcepts;

 class Arithmetic
{
	public void Multiply(int a, int b)
	{
		System.out.println("Multiplication :"+(a*b));
	}
	public void Multiply(int a, float b,double c)
	{
		System.out.println("Multiplication :"+(a*b*c));
	}
	public void Multiply(float x, double y)
	{
		System.out.println("Multiplication :"+(x*y));
	}
	public void Multiply(double a, long b)
	{
		System.out.println("Multiplication :"+(a*b));
	}
}

public class Polymorphism_MethodOverloading extends Arithmetic
{

	public static void main(String[] args) 
	{
		Polymorphism_MethodOverloading obj = new Polymorphism_MethodOverloading();
		obj.Multiply(5,5);
		obj.Multiply(5,1.5f,5);
		obj.Multiply(2.5,5);
		obj.Multiply(5,5);
	}

}
