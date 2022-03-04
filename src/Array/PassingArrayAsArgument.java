package Array;

public class PassingArrayAsArgument 
{
	// method to print an array, taking as an argument
	
	private static void printArray(int[] arr)   //Function Definition
	{
		System.out.println("Array contents printed through method :");
		  //print individual elements of array using enhanced for loop
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

	public static void main(String[] args) 
	{
		//integer array
		int[] intArray = {10,20,30,40,50,60,70,80};
		
		//call printArray method by passing intArray as an argument
		
		printArray(intArray);   //Function Call

	}

}
