
package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Program {

	public static void main(String[] args) 
	{
		Map<Integer,String> obj = new HashMap<Integer,String>();
		obj.put(new Integer(103),"John");
		obj.put(new Integer(101),"Sara");
		obj.put(new Integer(102),"Rahel");
		obj.put(new Integer(105),"Sharon");
		obj.put(new Integer(104),"Siyon");
		
		//System.out.println("Map Program----- "+obj);
		
		Set s = obj.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry obj2 = (Map.Entry)itr.next();
			System.out.println(obj2.getKey()+" "+obj2.getValue());
		}

	}

}
