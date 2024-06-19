package com.qa.tests;

public class Array5 {
	
	
	public static int[] get()
	{

		return new int[] {4, 9, 3};
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		int[] a=Array5.get();
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
