package MultiThreading;

public class CurrentThread
{

	public static void main(String[] args)
	{
		Thread t = new Thread();
		t.currentThread();
		System.out.println("Current Thread is ...."+t);
		t.setName(" MY THREAD ");
		System.out.println("After Name Change...."+t);
		try
		{
			for(int n=5;n>0;n--)
			{
				System.out.println(n);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Mail Thread Interrupted");
		}
		
	}

}
