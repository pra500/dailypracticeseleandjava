package com.qa.tests;

public class hh {

	public static void main(String[] args) {
		
		
		
		//how many uppercase and lowercase letters in a string
		
		//need to check again 
		
		
	String str="praGti is GIRL";
	
	
	int upper=0;
	int lower=0;

	for(int i=0;i<=str.length()-1;i++)
	{
		if(str.charAt(i)>=65 && str.charAt(i)<=90)
		{
			
			upper++;
		}
		else
		{
			lower++;			
		}	
			
	}
	
		
	System.out.println("the total of upper is " + upper);
	System.out.println("the total of lower is " + lower);
	
	
	/*
	the total of upper is 5
	the total of lower is 9
     */

	}

}
