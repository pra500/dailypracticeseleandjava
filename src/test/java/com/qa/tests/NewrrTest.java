package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewrrTest {
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	  
	  System.out.println( driver.getWindowHandle());
	
  }
  
	
  @Test
  public void urlTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  
	
  }
  
	
  @Test
  public void logoTest() {
	  
	  boolean flag=driver.findElement(By.xpath("//h1[normalize-space()='Learn Automation Courses']")).isDisplayed();
Assert.assertTrue(flag); 
	
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/login");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

  
  
}
