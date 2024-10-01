package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Loginsamplesite2Test {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {	  
	  
	  
	  boolean b=driver.findElement(By.xpath("//h2[normalize-space()='Test login']")).isDisplayed();	  
	  System.out.println(b);
	    
	  
	  
	  boolean b1=driver.findElement(By.xpath("//button[@id='submit']")).isDisplayed();	
	  System.out.println(b1);
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	     
	    driver=new ChromeDriver();	  
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
  
  //--------------
}
