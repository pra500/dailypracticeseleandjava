package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ttTest {
	
	
	
	WebDriver driver;
	
  @Test(priority = 0)
  public void fTest() {
	  
	  
	  System.out.println(driver.getTitle());
	 
	  
	  
  }
  
  
  @Test(priority = 1)
  public void fyTest() {
	  
	  System.out.println(driver.getTitle());
	 
	  
	  
  }
  @Test(priority = 2)
  public void fyyTest() {
	  
	  
	  System.out.println(driver.getTitle());
		 
	  
	  
  }
  
  
  @Test(priority = 3)
  public void fyyooTest() {
	  
	  
	  System.out.println(driver.getTitle());
		 
	  
	  
  }
	
	  @Test(priority = 4)
	  public void fyyiTest() {
		  
		  
		  System.out.println(driver.getTitle());
			 
		  
		  
	  }
	  
	 
	  
  @BeforeClass
  public void beforeClass() {
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  	
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
