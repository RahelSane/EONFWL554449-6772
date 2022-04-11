package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Methods 
{

	public static void main(String[] args) 
	{
		
		//Using FILTER
		List<String> list1 = List.of("Rahel","Rachel","Rebbeca","Genesis","Israyeli");
		
		List<String> newlist = list1.stream().filter(i -> i.startsWith("R")).collect(Collectors.toList());
		System.out.println(newlist);
		System.out.println("\n");
		
		//Using FILTER calculate Square of Numbers
		ArrayList<Integer> arr = new ArrayList();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		
		System.out.println(arr);
		System.out.println("\n");
		
		List<Integer> list2 = arr.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(list2);
		
		//Using Max Method Calculate Maximum Value in ArrayList
		Integer list3 = arr.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("\nMaximum Value is : "+list3);
		
		//Using Max Method Calculate Minimum Value in ArrayList
		Integer list4 = arr.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("\nMinimum Value is : "+list4);
		
		//Using Map Method Print the Square of Elements
		List<Integer> num1 = Arrays.asList(2,3,4,5,6,7,8,9);
		num1.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("\nSquare of Elements is : "+num1);
		
		//Using Sort Method Performing String Sorting
		List<String> names = Arrays.asList("Nashik","Pune","Mumbai","Panjab");
		List result = names.stream().sorted().collect(Collectors.toList());
		System.out.println("\nSorted Elements Are : "+result);
		
		List<Integer> list11 = Arrays.asList(24,45,67,98,42,56);
		IntSummaryStatistics stat = list11.stream().collect(Collectors.summarizingInt(i -> i+i));
		System.out.println("\nSum is : " +stat.getSum());
		System.out.println("\nCount is : " +stat.getCount());
		System.out.println("\nMax is : " +stat.getMax());
		System.out.println("\nMin is : " +stat.getMin());
		
		
		
		
		
		
		
	}

}
