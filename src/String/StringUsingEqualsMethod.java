package String;

public class StringUsingEqualsMethod
{

	public static void main(String[] args) 
	{
		String str1="Rahel";
		String str2="Rahel";
		String str3=new String("Rahel");
		String str4="Sara";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
	}

}
