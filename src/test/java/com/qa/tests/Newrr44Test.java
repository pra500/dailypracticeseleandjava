package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Newrr44Test {
	
	
	WebDriver driver;
	
		
	
  @Test
  public void fTest() {
	  
	 System.out.println(driver.getTitle());
	 
	  
	  
	 String url=driver.getCurrentUrl();	 
	 System.out.println(url);
	 
	 
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
