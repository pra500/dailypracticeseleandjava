package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TTest {
	
	
	
	WebDriver driver;
	
	
	
  @Test(priority = 0)
  public void fTest() {
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Test Login | Practice Test Automation");  
	 
  }
  
	
  @Test(priority = 1)
  public void fiTest() {
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Test Login | Practice Test Automation");  
	 
  }
  
	
  @Test(priority = 2)
  public void fiiTest() {
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Test Login | Practice Test Automation");  
	 
  }
  
  
  @BeforeClass
  @Parameters("brow")
  public void beforeClass(String br) {
	  
	  if(br.equalsIgnoreCase("chrome"))
			  {
		  driver=new ChromeDriver();
			  }
	  
	  else if(br.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
       
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {	  
	  driver.close();
  }

}
