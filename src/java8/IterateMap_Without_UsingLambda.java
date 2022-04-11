package java8;

import java.util.HashMap;
import java.util.Map;

public class IterateMap_Without_UsingLambda
{
	public static void main(String[] args)
	{
Map<String, Integer> prices = new HashMap<>();
		
		prices.put("Apple  ",   100);
		prices.put("Orange ",  80);
		prices.put("Papaya ",  60);
		prices.put("Grapes ",  70);
		prices.put("Banana ",  50); 
		
		for(Map.Entry<String, Integer>entry:prices.entrySet())
		{
			System.out.println("Fruit : " + entry.getKey() +", Prices : " +entry.getValue());
		}
	}
}
