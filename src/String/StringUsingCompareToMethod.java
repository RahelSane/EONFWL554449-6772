package String;

public class StringUsingCompareToMethod
{

	public static void main(String[] args) 
	{
		String str1="Rahel";
		String str2="Rahel";
		String str3="Tane";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str3.compareTo(str1));

	}

}
