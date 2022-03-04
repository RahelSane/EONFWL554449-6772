package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Program 
{

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		
		list.add("Shehnaaz Gill");
		list.add("Sidharth Shukla");
		list.add("Shehbaaz Gill");
		list.add("Rita Shukla");
		
		System.out.println("Original Elements of Array List :   "+list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object element = itr.next();
			System.out.println("Element----"+element);
		}
		

	}

}
