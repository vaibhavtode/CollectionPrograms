package com.java.collection;

public class TestEnumerate {
  
		// Here i am defining enum within class  
		public enum Season { WINTER, SPRING, SUMMER, FALL }  
		// here we are creating the main method  
		public static void main(String[] args) {  
		//Now, we print all enum  
		for (Season s : Season.values()){  
		System.out.println(s);  
		}  
		System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
		System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
		System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
		  
		}  

}
