package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ParaTest {
	
	
	
	

	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	String title= driver.getTitle();
	Assert.assertEquals(title, "Test Login | Practice Test Automation");	 	  
		 
	
  }
  
  
  @BeforeClass
  @Parameters("bro")
  public void beforeClass(String b) {
	  
	  
	 if(b.equalsIgnoreCase("chrome"))
	 {
		 driver=new ChromeDriver();	  
		 
	 }
	 else if(b.equalsIgnoreCase("firefox"))
	 {
		 driver=new FirefoxDriver();
	 }
	 else if(b.equalsIgnoreCase("edge"))	  
	 {
		 driver=new EdgeDriver();
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
