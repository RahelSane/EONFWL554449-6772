package Array;

public class ArrayUsingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score= {10,20,30};
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		int mean=(score[0]+score[1])/2;
		
		System.out.println("\nMean = "+mean);
		System.out.println("************USING VARIABLE i************");
		int i;
		for(i=0;i<=2;i++)
		{
			System.out.println("score["+i+"]="+score[i]);
		}
	}

}
