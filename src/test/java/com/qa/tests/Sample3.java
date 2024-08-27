package com.qa.tests;
import java.util.*;

import org.checkerframework.checker.units.qual.m;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a1,b2c, d3gd
		
		
		List<Object>list=new ArrayList<Object>();
		list.add("a1");
		list.add("b2c");
		list.add("d3gd");
		
		

		
		Map<Integer, Object>map=new HashMap<Integer, Object>();
		{
			
			
			for(int i=0;i<=list.size()-1;i++)
			{
			map.put(i++, list.get(i));
						
			
			}
			
		}
		
		
		
		
		for(Map.Entry<Integer, Object>mm:map.entrySet())
		{
			String str=(String) mm.getValue();
			String[] arr=str.split("");
			
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println(arr[i]);
				//char[]arr1=  arr[i].toCharArray();)
  
if(Character.isDigit(0))
{
	
	
	System.out.println(arr[i] + "numeric");
	
	
	
				}
			
			
			
			else
			{
				System.out.println(arr[i] + "not numeric");
			}
			
			
			//System.out.println(mm.getKey() + " " +mm.getValue());
		}
		
		
		

	}
	}
}
