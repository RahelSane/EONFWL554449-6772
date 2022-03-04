package String;

public class StringUsingDoubleEqualOperator
{

	public static void main(String[] args)
	{
		String str1="Rahel";
		String str2="Rahel";
		String str3=new String("Rahel");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
	}

}
