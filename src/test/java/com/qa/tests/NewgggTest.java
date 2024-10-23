package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewgggTest {
	
	WebDriver driver;

  @Test
  public void fTest() {
	  
	  System.out.println(driver.getWindowHandle());
	 
  }
  
  
  @Test
  public void flTest() {
	  System.out.println(driver.getPageSource());
	  
	 
  }
 // @Test
  public void flllTest() {
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

}
