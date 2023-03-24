package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class TestVector 
{
	public static void main(String[] args)
	{
		List list = new Vector();
		list.add("Vaibhav");
		list.add("Aastha");
		list.add("Srinivas");
		list.add("Shekhar");
		list.add("Vihar");
		list.add("Shekhar");
		
		  System.out.println(list.contains("Vaibhav"));
		  System.out.println(list.contains("Aastha"));
		  System.out.println(list.contains("Vihar111"));
		  System.out.println(list.isEmpty());
		 System.out.println(list.indexOf("Shekhar"));
		 System.out.println(list.indexOf("Srinivas"));
		  System.out.println(list.lastIndexOf("Shekhar"));
		 
		 
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
			
			
		}
	
	}

}
