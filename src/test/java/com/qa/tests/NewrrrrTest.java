package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewrrrrTest {
	
	
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	 // driver.getCurrentUrl();
  }
  
  
  @BeforeClass
  public void beforeClass() {	  

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/login");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
