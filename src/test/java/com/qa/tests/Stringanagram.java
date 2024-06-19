package com.qa.tests;

import java.util.Arrays;

public class Stringanagram {

	public static void main(String[] args) {
			
		
		String str="peek";
		String str1="keep";
		
		
		if(str.length()==str1.length())
		{
			
			char[] arr=str.toCharArray();
			char[] arr1=str1.toCharArray();
			
			Arrays.sort(arr);
			Arrays.sort(arr1);
			
			
			if(Arrays.equals(arr, arr1))
			{
				System.out.println("ana");  //ana
			}
			else				
			{
				System.out.println("not ana");
				
			}
			
			
		}
		
		
		

	}

}
