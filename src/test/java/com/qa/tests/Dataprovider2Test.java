package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Dataprovider2Test {
	

	WebDriver driver;
	

	
	  @Test
	  public void fTest() {
		  
 	  
			 
		
	  }
	  
	  public Object[][] mm()
	  {
		  
		  return Object[][]{
			  
			  
			  
			  
		  };
	  }
	  
  @BeforeClass
  public void beforeClass() {
	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
