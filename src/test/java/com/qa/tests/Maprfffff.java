package com.qa.tests;

import java.util.HashMap;
import java.util.Map;

public class Maprfffff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer>map=new HashMap<String, Integer>();
				
		map.put("ss",  10);
		map.put("ss1",  17);
		
	                                	
	for(Map.Entry<String, Integer>ss:map.entrySet())   
	{
		System.out.println(ss.getKey() + " " + ss.getValue());
	}
	                                	
	             
	
	int t=map.get("ss1");
	System.out.println(t);
	
//	
//	ss 10
//	ss1 17
//	17

	                                	
	                                	
	}

}
