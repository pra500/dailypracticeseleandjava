package com.qa.tests;

public class Bu {
	
	
	
public static void main(String[] args) {
	
	
	int[] arr= {5, 3, 2};
	int temp;
		
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
			
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				
				
			}
		}
	}
	
	
	for(int i:arr)
	{
		System.out.println(i);
	}
}
}
