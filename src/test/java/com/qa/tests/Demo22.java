package com.qa.tests;

public class Demo22 {

	public static void main(String[] args) {
				
		
	String s1="this is java";
	
	String[] arr=s1.split(" ");
	String s5="";
	
	for(int i=0;i<=arr.length-1;i++)
	{
		
		
		String s4=arr[i];
		String rev="";
		
		for(int j=s4.length()-1;j>=0;j--)
		{
			rev=rev+s4.charAt(j);	
			
			
		}
		
		
		s5=s5+rev+" ";
		
		
	}
	
	
	
		
		System.out.println(s5);		


	}
	
	//siht si avaj 


}
