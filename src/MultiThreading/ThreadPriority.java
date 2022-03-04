package MultiThreading;

class A2 extends Thread
{
	public void run()
	{
		System.out.println("Thread A");
		for(int i=1;i<=10;i++)
		{
			System.out.println("value of i thread A"+i);
		}
		System.out.println("exit A");
	}
}

class B2 extends Thread
{
	public void run()
	{
		System.out.println("Thread B started");
		for(int j=1;j<=10;j++)
		{
			System.out.println("value of j thread B"+j);
		}
		System.out.println("exit B");
	}
}

class C2 extends Thread
{
	public void run()
	{
		System.out.println("Thread C started");
		for(int K=1;K<=10;K++)
		{
			System.out.println("value of K thread C"+K);
		}
		System.out.println("exit C");
	}
}


public class ThreadPriority
{

	public static void main(String[] args) 
	{
		A2 objA  = new A2();
		B2 objB = new B2();
		C2 objC = new C2();
		
		objC.setPriority(Thread.MAX_PRIORITY);
		//objC.setPriority(10);
		
		objB.setPriority(objB.getPriority()+1);
		//objB.setPriority(Thread.NORM_PRIORITY);
		//objB.setPriority(5);
		
		objA.setPriority(Thread.MIN_PRIORITY);
		//objA.setPriority(1);
		
		System.out.println("Start Thread A");
		
		objA.start();
		
		System.out.println("Start Thread C");
				
		objC.start();
		
		System.out.println("Exit from main thread");
	}

}
