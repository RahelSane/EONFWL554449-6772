package Synchronization;

class callme
{
	synchronized void call(String msg)
	{
		System.out.println("["+msg);
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupt");
		}
		System.out.println("]");
	}
	
class Calller implements Runnable
{
	String msg;
	callme target;
	Thread th;
	
	public Calller(callme t,String s)
	{
		target=t;
		msg=s;
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		target.call(msg);
	}
 class MainClass
 {
	
	public void main(String[] args)
	{
		callme target=new callme();
		Calller a1=new Calller(target,"Hello");
		Calller a2=new Calller(target,"Java");
		Calller a3=new Calller(target,"World");

	}
 }
}
}

