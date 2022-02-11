package OopsConcepts;

public class PrecedenceOperator {

	public static void main(String[] args)
	{
		int p=9, q=6, r=4, s=2;
		int calculation;
		calculation=p+(q*s)/r;
		
	   /*
	      9+(6*2)/4
		  9+12/4
		  9+3
		  12
	  */
		System.out.println("\n Calculation is :"+calculation);
	

	}

}
