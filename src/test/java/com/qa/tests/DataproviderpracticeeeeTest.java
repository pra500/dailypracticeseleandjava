package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderpracticeeeeTest {
	

	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	  
	  
	  System.out.println(driver.getCurrentUrl());
	
	  
	  
  }
  
  
	
  @Test
  public void fjjTest() {
	  
	  
	  System.out.println();
	  driver.getPageSource();
	  
	  
  }
  
  
  
  
  
	
  @DataProvider
  @Test
  public void fjkkjTest() {
	  
	  
	  
	  
  }
  
 
  
  
	
  @DataProvider
  @Test
  public void fjkkjTest() {
	  
	  
	  
	  
  }
  

  @BeforeClass
  public void setup()
  {
	  
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/login");
  }
  
  @AfterClass
  public void teardown()
  {
	 driver.close(); 
  }

}
