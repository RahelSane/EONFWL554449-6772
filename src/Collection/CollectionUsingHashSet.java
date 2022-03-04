package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionUsingHashSet
{

	public static void main(String[] args)
	{
		Set hash = new HashSet();
		
		hash.add("Wilson");
		hash.add("Rajesh");
		hash.add("Manoj");
		hash.add("Vijay");
		hash.add("John");
		
		Iterator itr=hash.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
