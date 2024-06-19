package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class GroupingTest {

	
	
	//need to prepare notes 
	

	WebDriver driver;
	
	
  @Test(groups = {"sanity"})
  public void fTest() {
	  
	  System.out.println("a");
  }
  
  
  @Test(groups = {"smoke"})
  public void f0Test() {
	  
	  System.out.println("a1");
  }
  
  
  @Test(groups = {"reg"})
  public void f1Test() {
	  System.out.println("a2");
  }
  
  
  @Test(groups = {"smoke"})
  public void f2Test() {
	  System.out.println("a3");
  }
  
  
  
  @Test(groups = {"sanity"})
  public void f3Test() {
	  System.out.println("a4");
  }
  
  
  @Test(groups = {"reg"})
  public void f4Test() {
	  System.out.println("a5");
  }
  
    

}
