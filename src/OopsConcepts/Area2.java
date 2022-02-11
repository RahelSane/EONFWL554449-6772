package OopsConcepts;

public class Area2 {
	
	public Area2(float pi,int r)
	{
		double area=pi*r*r;
		System.out.println("Radius of circle:"+r);
		System.out.println("Area of circle:"+area);
	}
	
	public Area2(int l,int b)
	{
		int area=l*b;
		System.out.println("lenght of rectangle:"+l);
		System.out.println("breadth of rectangle:"+b);
		System.out.println("Area of rectangle:"+area);
	}
	
	

	public static void main(String[] args) 
	{
		Area2 obj   =new Area2(5,10);
		Area2 obj2   =new Area2(3.14f,3);

	}

}
