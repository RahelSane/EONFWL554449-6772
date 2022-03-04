
package Collection;

import java.util.List;
import java.util.ArrayList;

public class CollectionUsingList_ArrayList {

	public static void main(String[] args)
	{
		List list=new ArrayList();
		list.add(1);
		list.add("Rahel");
		list.add(3.14);
		list.add(true);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	}

}
