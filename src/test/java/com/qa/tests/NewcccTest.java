package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewcccTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	 String url= driver.getCurrentUrl();
	 
	  Assert.assertEquals(url, "https://rahulshettyacademy.com/AutomationPractice/");
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	     
		    driver=new ChromeDriver();	  
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  }

}
