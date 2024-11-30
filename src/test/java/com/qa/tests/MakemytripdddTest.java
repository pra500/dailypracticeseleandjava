package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MakemytripdddTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  System.out.println(driver.getTitle());
	 
  }



	
//getting URL of the page here:	
  @Test
  public void getURLTest() {
	  
	  //getting url of the page:
	String url=driver.getCurrentUrl();
	
	System.out.println(url);
	 
  }
  
  @Test
  public void getkklURLTest() {
	  
	  
	String url=driver.getCurrentUrl();
	
	System.out.println(url);
	 
  }
  
  
  @Test
  public void getkklURLTest() {
	  
	  
	String url=driver.getClass();
	
	System.out.println(url);
	 
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
