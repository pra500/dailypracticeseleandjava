package com.qa.tests;

import java.util.HashSet;
import java.util.Set;

public class Bubble {
	
	
	public static void main(String[] args) {
			

		int[] arr= {4, 15,9};		
		int temp;
		
		for(int i=0;i<=arr.length-1;i++)
		{
		
			for(int j=0;j<=arr.length-i-1;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			
				
			}
		}
	
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		
	}
		
	}
			
		
		
		
	}


