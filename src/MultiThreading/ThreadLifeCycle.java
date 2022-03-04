package MultiThreading;

class A3 implements Runnable
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

class B3 implements Runnable
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

class C3 implements Runnable
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



public class ThreadLifeCycle
{

	public static void main(String[] args)
	{
		A3 obj1 =new A3(); //here we create object
		B3 obj2 = new B3();
		C3 obj3 = new C3();
		
		Thread t1 = new Thread(obj1); // here we create thread
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start(); //Ready to run OR Runnable State
		
		try
		{
			t1.join();		
		}
	    catch(InterruptedException e)
	    {
	    	e.printStackTrace();
	    }	
		
		t2.start();
		t2.suspend();
		t3.start();
		
		

		for(int m=1;m<10;m++)
		{
			if(m==5)
			{
				t2.resume();  //here resume the suspended thread
		    }
	 		System.out.println("Value of m  "+m);
	    }
		
		
		

    }
	
	
}

