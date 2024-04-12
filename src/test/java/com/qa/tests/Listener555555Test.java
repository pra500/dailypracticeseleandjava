package com.qa.tests;

import org.testng.annotations.Test;

import ppp.Listener;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterClass;





@Listeners(ppp.Listener.class)
public class Listener555555Test extends Listener{
	
	
	
  @Test
  public void fTest() {
	  
	  Assert.assertTrue(false);
  }
  
  
  @Test
  public void fiTest() {
	  
	  Assert.assertFalse(false);
  }
  
  
  @Test
  public void foTest() {
	  
	  Assert.assertTrue(true);
  }
  

}
