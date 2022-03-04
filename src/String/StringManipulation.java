package String;

public class StringManipulation 
{

	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("Object Language");
		System.out.println("Original String :"+str);
		
		//Obtaining String Length
		System.out.println("Length Of String :"+str.length());
		
		//Accessing Character In String
		for(int i=0;i<str.length();i++)
		{
			int p=i+1;
			System.out.println("Character At Position :"+p+" is "+str.charAt(i));
			
		}
		
		//Inserting a String in the Middle
		String str2 = new String(str.toString());
		int pos=str2.indexOf("Language");
		
		str.insert(pos, "Oriented");
		
		System.out.println("String Now :"+str);
		
		//Modifying Character
		str.setCharAt(6, '-');
		System.out.println("String Now :"+str);
		
		//Appending a String at the end
		str.append("improve Security");
		System.out.println("Append String "+str);

	}

}
