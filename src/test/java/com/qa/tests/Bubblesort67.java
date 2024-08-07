package com.qa.tests;

public class Bubblesort67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr= {7, 8, 4};
		int temp=0;
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		
		for(int c:arr)
		{
			System.out.println(c);
		}
		
	}

}
