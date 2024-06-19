package com.qa.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dummy {

	public static void main(String[] args) {

                String s1="aabbbcccdddd";

              char[] arr=s1.toCharArray();
              
              Map<Character, Integer>map1=new HashMap<>();
              
              
              for(Character c:arr)
              {
            	  if(map1.containsKey(c))
            	  {
            		  map1.put(c,  map1.get(c)+1);
            		  
            	  }
            	  else
            	  {
            	  map1.put(c, 1);
            	  
            	  }      	  
            	  
            	  
              }
              
          
              
           Set<Map.Entry<Character, Integer>>set11= map1.entrySet();
        for(Map.Entry<Character, Integer>se:set11)
        {
        	if(se.getValue()>1)
        	{
        		System.out.print(se.getKey() + se.getValue());
        	}
        }
                  
                  
}
}