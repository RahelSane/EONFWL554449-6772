package OopsConcepts;

public class AreaSquare 
{
	public void area(int side)
	{
		System.out.println("Side of Square :"+side);
		System.out.println("Area of Square :"+side*side);
	}
	
	public int output(int l,int b)
	{
		return l*b;
	}
	

	public static void main(String[] args)
	{
		
		AreaSquare obj=new AreaSquare();
		obj.area(5);
		System.out.println("\n Area of Rectangle is : "+obj.output(6, 6));
		//obj.output(6,6);

	}

}
