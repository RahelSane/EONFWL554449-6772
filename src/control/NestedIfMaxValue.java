package control;

import java.util.Scanner;

public class NestedIfMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		int max=0;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Value Of A = ");
			a=sc.nextInt();
			System.out.println("Enter Value Of B = ");
			b=sc.nextInt();
			System.out.println("Enter Value Of C = ");
			c=sc.nextInt();
			if(a>b)
			{
				if(a>c)
					max=a;
				else
					max=c;
			}
			else
				{
					if(b>c)
						max=b;
					else
						max=c;
				}
			System.out.println("\\n Maximum Value = "+max);
			
	}

}
