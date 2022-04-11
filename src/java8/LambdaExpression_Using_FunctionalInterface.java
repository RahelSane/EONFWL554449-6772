package java8;

//Java Program to demostrate Lambda Expression to Implement
//a user defined Functional Interface.

@FunctionalInterface
interface Square
{
	int calculate(int x);
}

public class LambdaExpression_Using_FunctionalInterface
{

	public static void main(String[] args)
	{
		int a=5; 
		Square s=(int x)->x*x; //Lambda Expression to define the calculate method
		
		//parameter passed & return type must be same as defined in the prototype
		int ans=s.calculate(a);
		System.out.println(ans);

	}

}
