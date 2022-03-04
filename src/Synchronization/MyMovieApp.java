package Synchronization;

class BookMyShow
{
	static int total_tickets=10;
	synchronized public void bookTickets(int ticket)
	{
		if(total_tickets>=ticket)
		{
			total_tickets = total_tickets-ticket;
			System.out.println(ticket+"has bookest has been booked & remaining are"+total_tickets);
		}
		else
		{
			System.out.println("Ticket is not booked only"+total_tickets+"are available ");
		}
	}
}

public class MyMovieApp extends Thread
{
	static BookMyShow book;
	int t;
	public void run()
	{
		book.bookTickets(t);
	}
	
	public static void main(String[] args)
	{
		book = new BookMyShow();
		
		MyMovieApp Sara = new MyMovieApp();
		//Sara.setName("Sara");
		Sara.t = 5;
		Sara.start();
		
		MyMovieApp Rahel = new MyMovieApp();
		//Rahel.setName("Rahel");
		Rahel.t = 5;
		Rahel.start();
		
		
	}
}
