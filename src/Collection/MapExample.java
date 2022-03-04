package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample 
{

	public static void main(String[] args) 
	{
		Map<String,String> fruit = new HashMap<String,String>();
		
		fruit.put("Apple", "  Red");
		fruit.put("Mango", "  Mustard");
		fruit.put("Banana", " Yellow");
		fruit.put("Cherry", " Red");
		fruit.put("Guava", "  Green");
		
		for(String key:fruit.keySet())
		{
			System.out.println(key + ":" +fruit.get(key));
			{
				
			}
		}

	}

}

