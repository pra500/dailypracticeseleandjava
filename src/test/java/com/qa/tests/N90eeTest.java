package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class N90eeTest {
	
	
	WebDriver driver;
	
	
		
  @Test
  public void fTest() {
	  
	  driver.getPageSource().contains("meta");  
	  
	  driver.getTitle().contains("Test");
	  
  }
  
	
@Test
public void fjTest() {

driver.getPageSource().contains("alternate");



boolean b =driver.getTitle().contains("Web");
}


@Test
public void fiiiTest() {

driver.getPageSource().contains("inline");

}


  
  @BeforeClass
  public void beforeClass() {
	  

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
		driver.get("https://www.scrapingcourse.com/ecommerce/");
		
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
