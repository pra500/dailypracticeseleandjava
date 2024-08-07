package alwayspracticehere;

import java.util.*;


public class Dummy6 {

	public static void main(String[] args) {
		//i/p-i am a java programmer
		//o/o-i-1 am-1 a-1 java-1 programmer-1
		
		
		
		
	String str="i am a java programmer";
	
	String[]arr=str.split(" ");
	
	
	Map<String, Integer>map=new HashMap<String, Integer>();
	
	for(String s:arr)
	{
		if(map.containsKey(s))
		{
			map.put(s, map.get(s)+1);
			
		}
		else
			map.put(s, 1);
		
	}
	
	
	  Set<Map.Entry<String, Integer>>m1=map.entrySet();
	  
	  for(Map.Entry<String, Integer>ms:m1)
	  {
		  if(ms.getValue()>=1)
		  {
			  
			  
			  System.out.println(ms.getKey() + " " +ms.getValue());
		  }
	  }
	
	
	
	
	}

}
