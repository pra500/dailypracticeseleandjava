package com.qa.tests;

public class Stringreversal {

	public static void main(String[] args) {
		
		
//		String str="pragti";
//		String str1="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			str1=str1+str.charAt(i);
//		}
//		
//		
//		System.out.println(str1);
//		
		
		
		String str="java is easy";		
		
		String[] arr=str.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			sb.append(arr[i]);
			sb.append(" ");
			
		}
		
		System.out.println(sb.toString().trim());
		
		
	}

}
