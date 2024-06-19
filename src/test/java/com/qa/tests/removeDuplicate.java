package com.qa.tests;

import java.util.LinkedHashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="praggti";
		
		char[] arr=                str.toCharArray();
		
		LinkedHashSet<Character> ll=new LinkedHashSet<Character>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
		ll.add(arr[i]);
		}
		
		for(Character c:ll)
		{
			System.out.println(c);
		}

	}
	
//	
//	
//	p
//	r
//	a
//	g
//	t
//	i


}
