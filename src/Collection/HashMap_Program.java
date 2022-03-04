package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Program 
{

	public static void main(String[] args) 
	{
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Martyn", "Mahendra Singh Dhoni");
		map.put("Nelson", "Virat Kohli");
		map.put("David", "Andre Russell");
		
		System.out.println("Name    : "+map.get("Martyn"));
		
		System.out.println("ID      : "+map.get("Nelson"));
		
		System.out.println("Address : "+map.get("David"));
	}

}
