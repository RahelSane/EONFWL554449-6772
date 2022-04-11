package java8;

import java.util.function.Predicate;

public class Predicate_Even_Nums
{

	public static void main(String[] args)
	{
		int[] num = { 1,2,3,4,5,6,7,8,9,10 };
		
		Predicate<Integer> even = x-> x%2 == 0; //Print Even Numbers	
		
		for(int i:num)
		{
			if(even.test(i)) 
			{
				System.out.println(i);
			}
		}

	}

}
