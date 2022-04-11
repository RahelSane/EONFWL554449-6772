package AssignmentOfString;

public class CheckBeforeAndAfterCharIsSame {
	public boolean leftAndRightSame(String stng) 
	{
	  int l = stng.length();
	  boolean found = true;
	  for (int i = 0; i < l; i++) 
	  {
	    String tmpString = stng.substring(i,i+1);
	    if (tmpString.equals("#") && i > 0 && i < l-1) 
	 {
	      if (stng.charAt(i-1) == stng.charAt(i+1))
	        found = true;
	      else
	        found = false;
	    }
	  }
	  return found;
	}

	public static void main(String[] args) {
		CheckBeforeAndAfterCharIsSame obj= new CheckBeforeAndAfterCharIsSame();
	      String str1 = "rahel#sane";
	      
	      System.out.println("The given string is: "+str1);
	      System.out.println("The before and after character are same: "+obj.leftAndRightSame(str1));

	}

}
