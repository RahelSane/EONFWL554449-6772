package java8;

import java.util.function.Predicate;

public class Predicate_Age_Example 
{

	public static void main(String[] args) 
	{
		Predicate<Integer> p = age -> (age>18);
		System.out.println(p.test(21)); //true
		System.out.println(p.test(21)); //false

	}

}
