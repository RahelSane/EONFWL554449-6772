package OopsConcepts;

abstract class MobilePhone1
{
	abstract void makecall();
	
	
	public void Info()
	{
		System.out.println("All About Mobile Phones");	
	}
}
class SimplePhone1 extends MobilePhone1
{
	 void makecall()
	{
		System.out.println("Audio Calling");
	}
}
 class SmartPhone1 extends MobilePhone1
{
	
	 void makecall()
	{
		System.out.println("Video Calling");
	}
}

public class AbstractTestProgram {

	public static void main(String[] args)
	{
		MobilePhone1 m[]=new MobilePhone1[2];
		m[0]=new SimplePhone1();
		m[1]=new SmartPhone1();
		for(MobilePhone1 x:m)
		{
			x.Info();
			x.makecall();
		}

	}

}
