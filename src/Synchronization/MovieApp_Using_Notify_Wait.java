package Synchronization;

class TotalEarning extends Thread
{
	int total=0;
	public void run()
	{
		synchronized (this)
		{
			for(int i=1;i<=10;i++)
			{
				total=total+1;
			}
			this.notify();
		}
	}
}

public class MovieApp_Using_Notify_Wait
{ 
	

	public static void main(String[] args) throws InterruptedException 
	{
		TotalEarning obj = new TotalEarning();
		obj.start();
		
		synchronized (obj)
		{
			obj.wait();
			System.out.println("Toal Earning is "+obj.total);
		}
	}

}
