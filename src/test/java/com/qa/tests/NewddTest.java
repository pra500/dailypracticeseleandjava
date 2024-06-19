package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewddTest {
	
	
	
	
	 WebDriver driver;
	
	
  @Test
  public void fTest() {

	 String url= driver.getCurrentUrl();
	 System.out.println(url);
	 	 
	 
	 
  }
  
  
  @Test(dependsOnMethods = {"fTest"})
  public void fkTest()
  {

	 String url= driver.getCurrentUrl();
	 System.out.println(url);
	 
	 
	 
	 
  }
  
  
  
  @Test(dependsOnMethods = {"fTest"})
  public void fkkTest()
  {
	 String url= driver.getCurrentUrl();
	 System.out.println(url);
	 
	  
	 
  }   
  
  
  @Test
  public void fjTest() {

	 String url= driver.getCurrentUrl();
	 System.out.println(url);
	 
	 Assert.assertEquals(url, "https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	 
	 
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");	
		
		
	  
	 
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
