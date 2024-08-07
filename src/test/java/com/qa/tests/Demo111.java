package com.qa.tests;

import java.util.*;


public class Demo111 {
	
	public static void main(String[] args) {
		
		
		//String s1="My Name is Puneet";
		
		
		
		
		
	String str="aaammyyyeeebbgg";		
	
	char[] arr=str.toCharArray();
	
	Map<Character, Integer> map=new HashMap<Character, Integer>();
		
	for(char c:arr)
	{
		if(map.containsKey(c))
			{
			map.put(c, map.get(c)+1);
			}
		else
			{
			map.put(c, 1);
			//})
		
	}
	
	
               Set<Map.Entry<Character, Integer>> set1=map.entrySet();
               
               for(Map.Entry<Character, Integer>m:set1)
               {
            	   if(m.getValue()>=1)
            	   {
            		   
            		   
            		System.out.println(m.getKey() + " " +m.getValue());
            	   }
            	   
               }
	
	
               
               
		
		
	//}

//}
