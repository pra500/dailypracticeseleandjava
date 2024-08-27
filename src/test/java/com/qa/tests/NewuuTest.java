package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewuuTest {
	
	WebDriver driver;
	
	
  @Test(priority = 0)
  public void fTest() {
	  
	  System.out.println(driver.getTitle());
	
	  
  }
  
  @Test(priority = 1, dependsOnMethods = {"fTest"})
  public void f1Test() {
	  
	  System.out.println(driver.getTitle());
	
	  
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
