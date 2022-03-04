package Array;

public class ArrayUsingArgument
{
	public void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)
	{
		int nums[]= {11,22,33,44,55};
		
		ArrayUsingArgument obj = new ArrayUsingArgument();
		obj.display(nums);

	}

}
