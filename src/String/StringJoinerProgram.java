package String;

import java.util.StringJoiner;

public class StringJoinerProgram
{

	

	public static void main(String[] args)
	{
		StringJoiner joinNames = new StringJoiner(","); //passing comma(,)
		
		joinNames.add("Sohan");
		joinNames.add("Siyon");
		joinNames.add("Sharon");
		joinNames.add("Simarn");
		
		System.out.println(joinNames);
	}


}
