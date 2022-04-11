package AssignmentOfArray;

public class SecondLargestNumber
{
	public static int getSecondLargest(int[] a, int total)
	{ 
		int temp; 
		for (int i = 0; i < total; i++)     
		{        
			for (int j = i + 1; j < total; j++)      
			{         
				if (a[i] > a[j])              
				{                   
					temp = a[i];                
					a[i] = a[j];                    
					a[j] = temp;                
					}           
				}       
			}    
		return a[total-2];
	}

	public static void main(String[] args)
	{
		int a[] = { 11, 33, 88, 44, 66, 99, 77, 22, 55 };
		System.out.println("Second Largest Number: " + getSecondLargest(a, 9));
	}
}
