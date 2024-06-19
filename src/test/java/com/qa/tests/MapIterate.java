package com.qa.tests;

import java.util.HashMap;
import java.util.Map;

public class MapIterate {
	
	public static void main(String[] args) {
		
		

Map<String, String> hm=new HashMap<String, String>();
hm.put("name", "Amit");
hm.put("fname", "Rakesh");
hm.put("city", "BTM");

for(Map.Entry<String,String> e:hm.entrySet())
{
	
	System.out.println(e.getKey() + " " +e.getValue());

}
	}	

}

