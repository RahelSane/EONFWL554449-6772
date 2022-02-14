package OopsConcepts;

abstract class MobilePhone
{
	abstract void makecall();
	
	
	public void Info()
	{
		System.out.println("All About Mobile Phones");	
	}
}
 class SimplePhone extends MobilePhone
{
	 void makecall()
	{
		System.out.println("Audio Calling");
	}
}

 class SmartPhone extends MobilePhone
{
	
	 void makecall()
	{
		System.out.println("Video Calling");
	}
}


public class AbstractProgram {

	public static void main(String[] args)
	{
		SimplePhone obj = new SimplePhone();
		SmartPhone obj1=new SmartPhone();
		obj.Info();
		obj.makecall();
		obj1.Info();
		obj1.makecall();
	    
		
		

	}

}
