package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class R5Test {
	WebDriver driver;
	
	
	
  @Test(priority = 0)
  public void fyTest() {
	  
	  System.out.println( driver.getCurrentUrl());
	 
	 
	  
  }
	
	
  @Test(priority = 1)
  public void fkTest() {
	  
	  System.out.println( driver.getCurrentUrl());
		 
	  
  }
  
	
	
  @Test(priority = 2)
  public void flllTest() {
	  
	  System.out.println( driver.getCurrentUrl());
		 
	  
  }
	
	
  
	
  @Test(priority = 4)
  public void fjlTest() {
	  
	  System.out.println( driver.getCurrentUrl());
		 
	  
  }
  
	
  @Test(priority = 5)
  public void lTest() {
	  
	  System.out.println( driver.getCurrentUrl());
		 
	  
  }
  
	
  @Test(priority = 6)
  public void fiiTest() {
	  
	  System.out.println( driver.getCurrentUrl());
		 
	  
  }
	
 
  @BeforeClass
  public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
