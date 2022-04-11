package AssignmentOfCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques_3
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("SARA");
		list.add("RAHEL");
		list.add("JOHN");
		list.add("GENESIS");
		
		printAll(list);
	}

	public static void printAll(List<String> list)
	{
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}


