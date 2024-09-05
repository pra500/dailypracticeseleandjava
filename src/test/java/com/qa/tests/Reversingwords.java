package com.qa.tests;

public class Reversingwords {
	
	
	public static void main(String[] args) {
		
		

	       String str="My name is Pragati";
	       
	       String[] arr=str.split(" ");
	       
	       
	             	              
	              
	       String s2="";
	       
	       
	       for(int i=0; i<=arr.length-1; i++)
	       //for(int i=arr.length-1;i>=0;i--)
	       {
	           String s=arr[i];
	           for(int j=s.length()-1;j>=0;j--)
	           {
	               s2=s2+s.charAt(j);
	           }
	           
	          // arr1=arr1+arr
	       }
	        System.out.println(s2);
	        //arr1=arr
	        
	        
	}

}
