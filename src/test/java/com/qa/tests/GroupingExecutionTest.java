package com.qa.tests;

import org.testng.annotations.Test;

public class GroupingExecutionTest {

	/*
	 * 
	 * 
	 * author: Pragti Gupta functionality: grouping execution date: 17 Sep, 2024
	 * 
	 * 
	 * 
	 */

	@Test(groups = { "sanity" })	
	public void FTest() {

		System.out.println("jjjj");
	}

	@Test(groups = { "smoke" })
	public void FjTest() {

		System.out.println("jjjj1");
	}

	@Test(groups = { "smoke" })
	public void FffeeTest() {

		System.out.println("jjjj3");
	}

	@Test(groups = { "sanity" })
	public void FeeeTest() {

		System.out.println("example");
	}
	
	
	@Test(groups = { "reg" })
	public void Feee11Test() {

		System.out.println("world");
	}
	
	@Test(groups = { "reg" })
	public void Feee12Test() {

		System.out.println("hello");
	}
	
	
	
//	
//	jjjj
//	ccccc
	
	
	//world
	//hello
	
	

}
