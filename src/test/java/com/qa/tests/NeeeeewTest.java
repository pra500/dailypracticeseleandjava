package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NeeeeewTest {
	
	
	
	WebDriver driver;
	
	
  @Test
  public void getTest() {
	  
	String title=  driver.getTitle();
	  System.out.println(title);
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
