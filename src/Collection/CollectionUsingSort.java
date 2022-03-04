package Collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class CollectionUsingSort
{

	public static void main(String[] args) 
	{
		
		List list=new ArrayList();
		list.add("Sara");
		list.add("Rahel");
		list.add("Asha");
		list.add("Genesis");
		
		Collections.sort(list);
		System.out.println(list);
		

	}

}
