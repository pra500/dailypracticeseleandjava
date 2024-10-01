package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NoofframesTest {
	
	
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  Assert.assertEquals("pra", "pra");  }
  
  @Test
  public void fkTest() {
	  
	  Assert.assertEquals("pra", "prad");
  }
  
  @Test
  public void flTest() {
	  
	  Assert.assertTrue(true);
  }
  
  @Test
  public void flllTest() {
	  
	  Assert.assertFalse(true);
  }
  
  
  
  
  
  @Test
  public void fllylTest() {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--disable-notifications");
	  
	     
	    driver=new ChromeDriver(co);	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
  
  }
 
}
