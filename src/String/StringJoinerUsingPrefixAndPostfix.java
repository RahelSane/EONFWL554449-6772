package String;

import java.util.StringJoiner;

public class StringJoinerUsingPrefixAndPostfix
{

	public static void main(String[] args) 
	{
		StringJoiner joinNames = new StringJoiner(",","[","]"); //passing comma(,) and square brackets as delimiter
		
		joinNames.add("Asha");
		joinNames.add("Sara");
		joinNames.add("Rahel");
		joinNames.add("Genesis");
		
		System.out.println(joinNames);	

	}

}
