package com.qa.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stringcounteachchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="pragtig";
		
		
		char[] arr=str.toCharArray();
		
		
	Map<Character, Integer>map=new HashMap<Character, Integer>();
	
	for(Character e:arr)
	{
		if(map.containsKey(e))
		{
			map.put(e,  map.get(e)+1);
		}
		else
		{
			map.put(e,  1);
		}
		
	}
	
	Set<Map.Entry<Character, Integer>>set1=map.entrySet();
	
	for(Map.Entry<Character, Integer>ss:set1)
	{
		
		System.out.println(ss.getKey() + " " +ss.getValue());		
		
	}
	
	
	
	
	
	
		
		

	}

}
