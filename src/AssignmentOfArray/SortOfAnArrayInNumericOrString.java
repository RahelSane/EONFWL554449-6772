
package AssignmentOfArray;

import java.util.Arrays;

public class SortOfAnArrayInNumericOrString 
{

	public static void main(String[] args)
	{
		int[] array1 = { 999, 222, 111, 333, 666, 555, 444, 777, 888 };

		String[] array2 = { "Rahel", "Sara", "John", "Sharon", "Siyon", "Genesis" };
		
		System.out.println("Old Numeric Array : " + Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Sorted Numeric Array : " + Arrays.toString(array1));

		
		System.out.println("Old String Array : " + Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("Sorted String Array : " + Arrays.toString(array2));
	}

}
