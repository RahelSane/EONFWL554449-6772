package control;
import java.util.Scanner;

public class Decision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Marks");
		marks=sc.nextInt();
		if(marks>36)
		{
			System.out.println("PASS");
		
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
	}

}
