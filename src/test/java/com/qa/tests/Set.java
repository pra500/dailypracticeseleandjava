package com.qa.tests;

import java.util.*;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(1);
		set.add(2);		
		set.add(13);
		
		for(Integer i:set)
		{
			System.out.println(i);
		}

	}

}
