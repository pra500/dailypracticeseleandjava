package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CalenderpopupTest {	
	
	
	
	
	
	
	WebDriver driver;	
	
	
	
		
  @Test
  public void fTest() {	     	  
	  
	  
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Book Bus Tickets Online, Easy & Secure Booking, Top Operators - redBus");
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");	  
		
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  }

}
