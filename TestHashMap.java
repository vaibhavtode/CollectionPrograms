package com.java.collection;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap 
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		map.put("one","Apeksha");
		map.put("two","Vaibhav");
		map.put("four","Aastha");
		map.put("three","Vihar");
		map.put("five","KK");
		map.put("seven", "Anisha");
		System.out.println(map.get("three"));
		System.out.println(map.get("two"));
		System.out.println(map.get("one"));
		System.out.println(map.get("seven"));
		System.out.println(map.get("five"));
		System.out.println(map.get("four"));
		System.out.println(map.values());
		System.out.println(map.containsKey("three"));
		System.out.println(map.isEmpty());
		System.out.println(map.entrySet());
		System.out.println(map.size());
		System.out.println(map.remove("five"));
		System.out.println(map.remove("three"));
		System.out.println(map.entrySet());
		System.out.println(map.size());
		System.out.println(map.replace("seven","Srinivas"));
		System.out.println(map.entrySet());
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(map.get(it.next()));  //Keyset
			System.out.println(it.next());  //entryset
		}
	}
	
	
	

}
