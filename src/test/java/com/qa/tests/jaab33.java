package com.qa.tests;

import java.util.HashMap;
import java.util.Map;

public class jaab33 {
	
	public static void main(String[] args) {
		
		

		
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		
	map.put(12,  13);
	map.put(22,  20);
	map.put(99,  67);
		
		for(Map.Entry<Integer, Integer> m:map.entrySet())
			{
			
			System.out.println(m.getKey() + " " +m.getValue());
			
			
		}
		
	

}
}