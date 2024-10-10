package alwayspracticehere;

import java.util.*;

public class Stringreversingwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove 		
		
		
		
		String  str="java";
		
		char[] arr=str.toCharArray();
		
		
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		
		
		for(Character c:arr)
		{
			if(map.containsKey(c))
			{
				
				
				map.put(c, map.get(c)+1);					
				
			}
			
			else
			{
				map.put(c, 1);
			}
			
			
		}	
		
		
	Set<Map.Entry<Character, Integer>>set1=	map.entrySet();	
	
	for(Map.Entry<Character, Integer>mm:set1)
	{		
		
		if(mm.getValue()==2)
		{
			
			System.out.println(mm.getKey() + ":" + mm.getValue());
		
			
			
		}
		
		
	}
	
/*		
		
		String str="java is java";
		
		
String[] arr=str.split(" ");
		
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		
		for(String c:arr)
		{
			if(map.containsKey(c))
			{
				
				
				map.put(c, map.get(c)+1);					
				
			}
			
			else
			{
				map.put(c, 1);
			}
			
			
		}	
		
		
	Set<Map.Entry<String, Integer>>set1=map.entrySet();	
	
	for(Map.Entry<String, Integer>mm:set1)
	{		
		
		if(mm.getValue()==1)
		{
			
			System.out.println(mm.getKey() + ":" + mm.getValue());
		
			
			
		}
		
		
	}
	
		
		
		
		
*/		
		
		
		
	}
}