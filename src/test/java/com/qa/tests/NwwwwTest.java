package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NwwwwTest {
	
	
	
	
  @Test(priority = 0, expectedExceptions = nLL)
  public void fTest() {
	  
	  System.out.println("he");
  }
  
  
	
  @Test(groups = {"smoke"})
  public void fiTest() {
	  System.out.println("she");
  }
  
	
  @Test(dependsOnGroups = {"sanity"})
  public void fiiiTest() {
	  System.out.println("they");
  }
  
  

  @Test(dependsOnGroups = {"smoke"})
  public void fiii4Test() {
	  System.out.println("there");
  }
 

}
