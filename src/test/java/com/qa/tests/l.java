package com.qa.tests;

public class l {

	public static void main(String[] args) {
	
		String str="this is a java pgm";		
		
		
	    String[] arr=str.split(" ");  
	    
	    String rev="";	    
	    
	    for(int i=0;i<=arr.length-1;i++)
	    {  
	    	
	    	String s=arr[i];
	    	String st="";
	    	for(int j=s.length()-1;j>=0;j--)
	    	{
	    		st=st+s.charAt(j);
	    	}
	    	//System.out.println(st);  	
	    	    	
	    	
	    	rev=rev+st+" ";
	    	
	    }   

	System.out.println(rev);
		
		
		
		
		
		
		
		
	}
	
	

}
