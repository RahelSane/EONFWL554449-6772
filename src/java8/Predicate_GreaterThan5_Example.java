package java8;

import java.util.function.Predicate;

public class Predicate_GreaterThan5_Example
{

	public static void main(String[] args) 
	{
		int[] num = { 1,2,3,4,5,6,7,8,9,10 };
		
		Predicate<Integer> grt = y -> y>5; // Greater Than 5 Numbers
		
		for(int i:num)
		{
			if(grt.test(i))
			{
				System.out.println(i);
			}
		}

	}

}
