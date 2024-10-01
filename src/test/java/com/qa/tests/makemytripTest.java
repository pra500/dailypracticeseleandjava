package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class makemytripTest {
	
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  /*
  
	driver.findElement(
	  
	  #username
	  
	  #site-header
	  
	  
	  
	  */
	  
	  
	  
  }
  
  @Test
  public void f1Test() {
  }
  
  @Test
  public void f2Test() {
  }
  
  
  @Test
  public void f3Test() {
  }
  
  @Test
  public void f4Test() {
  }
  @Test
  public void f5Test() {
  }
  
  @Test
  public void f6Test() {
  }
  
  

  @BeforeClass
  public void beforeClass() {
	  
	   driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");	  
		
		
	  
  }
  
  

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  }
  
  
 
}
