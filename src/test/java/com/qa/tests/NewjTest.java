package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewjTest {
	
	
	
	
	WebDriver driver;
	
	
	
	
	
  //@Test
  public void fTest() {
	  
	 
	  String url= driver.getCurrentUrl(); 
	  Assert.assertEquals(url, "https://practicetestautomation.com/practice-test-login/");
	
	  
	  
  }
  
  //@Test  
  public void ifTest() {

	  String title= driver.getTitle();
	  Assert.assertEquals(title, "Test Login | Practice Test Automation");
	
	  
	  
  }
  
  
  @Test  
  public void iifTest() {

	System.out.println(driver.getClass());
	
	
	
	  
	  
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
