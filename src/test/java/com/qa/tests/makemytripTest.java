package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

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
	  public void f2Test() {
		  
		  String s=driver.getWindowHandle();
		  System.out.println(s);
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
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/chrome/ChromeOptions.html");	  
		
		
	  
  }
  
  

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  }
  
  
 
}
