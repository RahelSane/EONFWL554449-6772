package Array;

public class ArrayUsingTryCatch {

	public static void main(String[] args) {
		
        int num[] = {101,102,103,104,105};
		
        
        try
        {
			for(int i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}
        }
        catch(Exception e)
        {
        	System.out.println("Exception is Occurred");
        }
	}

}
