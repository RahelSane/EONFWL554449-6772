package Collection;

import java.util.Hashtable;

public class HashTable_Program 
{

	public static void main(String[] args) 
	{
		Hashtable table = new Hashtable();
		table.put("Name:", "Rachel");
		table.put("Id:", new Integer(101));
		table.put("Address0:", new String("Pune"));
		
		System.out.println("Table of Contents :"+table);
	}

}
