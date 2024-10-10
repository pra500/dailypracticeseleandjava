package com.qa.tests;

import java.util.Arrays;

public class Stringanagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="silent";
		String str1="lisent";
		
				
		if(str.length() == str1.length())
		{			
					
			
			char[] arr=str.toCharArray();
			char[] arr1=str1.toCharArray();
			
			Arrays.sort(arr);
			Arrays.sort(arr1);
			
			
			if(Arrays.equals(arr, arr1))
			{
				System.out.println("ana");
			}
			else
			{
				System.out.println("not ana");
			}
			
			
		}
	
	
	
	
	

	}

}
