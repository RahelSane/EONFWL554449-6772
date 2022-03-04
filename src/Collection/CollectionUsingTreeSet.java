package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionUsingTreeSet 
{

	public static void main(String[] args)
	{
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("Samsung");
		tree.add("Iphone");
		tree.add("Vivo");
		tree.add("Oppo");
		tree.add("Nokia");
		
		Iterator itr=tree.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		

	}

}
