package Array;

public class Two_Dimensional_Array 
{

	public static void main(String[] args) 
	{
		int[][] arr= new int[2][2];
		arr[0][0] = arr[1][1] = 1;
		arr[0][1] = arr[1][0] = 0;
		System.out.println("Array Elements are ");
		System.out.println(arr[0][0] +" " +arr[0][1]);
		System.out.println(arr[1][0] +" " +arr[1][1]);
	}

}
