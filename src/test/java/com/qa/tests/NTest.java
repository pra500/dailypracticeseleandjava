package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NTest {
	
	
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	  
	  
	  System.out.println( driver.getCurrentUrl());
	 
  }
  
	
  @Test
  public void fkTest() {
	  
	  
	  System.out.println( driver.getCurrentUrl());
	
		}
  
 
		
	  @BeforeClass
	 public void ge()
	 {
		  
		  
		  driver=new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://naveenautomationlabs.com/opencart/");
	  }
}

