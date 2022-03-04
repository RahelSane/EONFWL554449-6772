package String;

import java.util.StringJoiner;

public class StringJoinerAll_In_One_Example
{

	public static void main(String[] args)
	{
		StringJoiner joinNames1 = new StringJoiner(",","[","]");
		
		joinNames1.add("Sohan");
		joinNames1.add("Siyon");
		
		StringJoiner joinNames2 = new StringJoiner(":","#","#");
		
		joinNames2.add("Sara");
		joinNames2.add("Rahel");
		
		StringJoiner merge = joinNames1.merge(joinNames2);
		System.out.println(merge);

	}

}
