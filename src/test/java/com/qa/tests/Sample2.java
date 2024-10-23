package com.qa.tests;

import java.util.*;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//o/p: 0, 0, 0, 5, 7, 1, 9 , 8
		
		
		int[] arr= {5, 7, 0, 0, 1, 9, 0, 8};
		
		
		/*
		int temp;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			//for(int j=0;j<=arr.length-1;j++)
			//{
			
			
			
				temp=arr[i];
			   arr[i]=arr[i+1];
				
				arr[i+1]=temp;
				
				
				
				
			}
		
		*/
		
		Map<Integer,  Integer>map=new HashMap<Integer, Integer>();
				
		for(int i:arr)
		{
			if(map.containsKey(i))
			{
				map.put(map.get(i)+1, i);
				
			}
			else
			{
				map.put(i,  1);
			}
			
		}
		
		
		
		
		
		Set<Map.Entry<Integer, Integer>> set1=map.entrySet();
		
		for(Map.Entry<Integer, Integer>mm:set1)
		{
			if(mm.getValue()==1)
			{
				System.out.println(mm.getKey() + ":" +mm.getValue());
			}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		

	}

