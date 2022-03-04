package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionUsingIterator
{

	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add(1);
		list.add("Rahel");
		list.add(3.14);
		list.add(true);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
