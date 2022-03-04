package MultiThreading;

class A extends Thread
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

class B extends Thread
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

class C extends Thread
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


public class MultithreadingByExtendingThreadClass
{
	public static void main(String[] args)
	{
		A obj =new A();
		B obj2 = new B();
		C obj3 = new C();
		
		obj.start();
		obj2.start();
		obj3.start();

	}

}
