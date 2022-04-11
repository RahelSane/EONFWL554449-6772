package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Creation 
{

	public static void main(String[] args) 
	{
		
		//USING STREAM OF METHOD
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
		stream1.forEach(p -> System.out.println(p));
		
		//USING STREAM ARRAY METHOD
		Stream<Integer> stream2 = Stream.of(new Integer[] {10,20,30,40,50,60,70,80,90});
		stream2.forEach(a -> System.out.println(a));
		
		//USING LIST
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			list1.add(i);
		}
		Stream<Integer> list2 = list1.stream();
		list2.forEach(a -> System.out.println(a));
		
		//USING CHARS
		IntStream stream3 = "abcde_12345".chars();
		stream3.forEach(p -> System.out.println(p));
	}

}
