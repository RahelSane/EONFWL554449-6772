package AssignmentOfString;

public class EndingWithString
{

	public static void main(String[] args)
	{
		String str = "My Name Is Rahel Rajesh Sane";
		int cnt=0;
		
		String str1[]=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i].endsWith("e") || str1[i].endsWith("S"))
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
