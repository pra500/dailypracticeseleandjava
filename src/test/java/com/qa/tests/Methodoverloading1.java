package com.qa.tests;

public class Methodoverloading1 {
	
	
	
	public static void add(int a)
	{
		System.out.println(a);
		
	}
	
	public static void add(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		
		
		
	}
	
	
	
	
	
//	public static void add(float f)
//	{
//		double g;
//		g=f*f;
//		System.out.println(g);
//		
//	}
//	
	
	
	
	
	
	

	public static void main(String[] args) {
	
		 Methodoverloading1.add(2);
		
		 Methodoverloading1.add(1, 6);
		
		 //Methodoverloading1.add(2.4);
		
		

	}

}
