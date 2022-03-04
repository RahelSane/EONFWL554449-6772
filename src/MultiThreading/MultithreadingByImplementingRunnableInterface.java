package MultiThreading;

class A1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread A is started");
		for(int i=1;i<=10;i++)
		{
			System.out.println("value of i in thread A"+i);
		}
		System.out.println("Thread A is Exit");
	}
}

class B1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread B is started");
		for(int j=1;j<=10;j++)
		{
			System.out.println("value of j in thread B"+j);
		}
		System.out.println("Thread B is Exit");
	}
}

class C1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread C is started");
		for(int K=1;K<=10;K++)
		{
			System.out.println("value of K in thread C"+K);
		}
		System.out.println("Thread C is Exit");
	}
}



public class MultithreadingByImplementingRunnableInterface 
{

	public static void main(String[] args) 
	{
		A1 obj1 =new A1(); //here we create object
		B1 obj2 = new B1();
		C1 obj3 = new C1();
		
		Thread t1 = new Thread(obj1); // here we create thread
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start(); //here we call the thread
		t2.start(); 
		t3.start();
		
		/*
		try
		{
			t1.join();		
		}
	    catch(InterruptedException e)
	    {
	    	e.printStackTrace();
	    }	
	    */
	}

}
