package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Program 
{

	public static void main(String[] args)
	{
		TreeMap tmap = new TreeMap();
		tmap.put("Name:", "Rachel");
		tmap.put("Id:", new Integer(1001));
		tmap.put("Address0:", new String("Maharashtra"));
		
		Collection values = tmap.values();
		Iterator itr = values.iterator();
		System.out.println("*****Printing The Values Are*****");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
