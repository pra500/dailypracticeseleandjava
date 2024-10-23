package com.qa.tests;

public class Bubblesorting12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		
		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
		 int temp;
		 
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 
			 for(int j=0;j<arr.length-1-i;j++)
			 {
				 if(arr[j]>arr[j+1])
				 {
					 
					temp=arr[j];					
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			
					 
				 }
			 }
		 }
		 
		 
		 
		 for(int k:arr)
		 {
			 System.out.println(k);
		 }
	}

}
