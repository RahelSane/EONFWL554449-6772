package java8;

interface FI
{
	public void add(int x, int y);
}

public class FunctionalInterface_AddNums 
{

	public static void main(String[] args) 
	{
		FI obj = (x,y) -> System.out.println("Addition Is : "+(x+y));
		obj.add(5, 4);

	}

}
