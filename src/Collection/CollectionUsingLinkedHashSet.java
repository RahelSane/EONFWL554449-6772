package Collection;

import java.util.LinkedHashSet;

public class CollectionUsingLinkedHashSet 
{

	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add(new String("Apple"));
		lhs.add(new String("Zebra"));
		lhs.add(new String("Sun"));
		lhs.add(new String("Ball"));
		lhs.add(new String("Yak"));
		
		Object array[] = lhs.toArray();
		for(int x=0;x<5;x++)
		{
			System.out.println(array[x]);
		}
		
		
		
	}

}
