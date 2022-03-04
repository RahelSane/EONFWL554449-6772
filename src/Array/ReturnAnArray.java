package Array;

import java.util.Arrays;

public class ReturnAnArray
{
	public static String[] return_Array()
	{
		//define string array
		String[] ret_Array= {"Java","C++","Python","Ruby","C"};
		
		//return Atring Array
		return ret_Array;
	}
	public static void main(String[] args) 
	{
		//call method return_array that returns array
		
		String[] str_Array=return_Array();
		
		System.out.println("Array returned from method :"+Arrays.toString(str_Array));
	}

}
