package OopsConcepts;

public class Area
{
	//Area of Square
	public Area(int a)
	{
		int area=a*a;
		System.out.println("Side of Square is :"+a);
		System.out.println("Area of Square is :"+area);
		
	}
	    //Area of Rectangle
	public Area(int l,int b)
	{
		int area=l*b;
		System.out.println("Lenght of Rectangle :"+l);
		System.out.println("Breadth of Rectangle :"+b);
		System.out.println("Area of Rectangle :"+area);
		
	}
	     //Area of Circle
	public Area(double pi,int r)
	{
		double area=pi*r*r;
		System.out.println("Radius of Circle :"+r);
		System.out.println("Area of Circle :"+area);
		
	}
	

	public static void main(String[] args)
	{
	    Area obj1=new Area(5);
	    Area obj2=new Area(10,5);
	    Area obj3=new Area(3.14,3);

	}

}
