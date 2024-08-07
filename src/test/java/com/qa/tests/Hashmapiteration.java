package com.qa.tests;

import java.util.HashMap;
import java.util.Map;

public class Hashmapiteration {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(12, "pra");
		map.put(22, "pra");
		
	for(Map.Entry<Integer, String>mm:map.entrySet())
	{
		System.out.println(mm.getKey() + " " + mm.getValue());
	}
	
		
		
		String s=map.get(12);
		System.out.println(s);

	}

}
