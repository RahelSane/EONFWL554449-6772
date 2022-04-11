package java8;

import java.util.function.Predicate;

public class Predicate_IsEquals_Example
{

	public static void main(String[] args) 
	{
		Predicate<String> name = Predicate.isEqual("Pune");
		
		//System.out.println(name.test("Pune")); //true
		
		System.out.println(name.test("Mumbai")); //false

	}

}
