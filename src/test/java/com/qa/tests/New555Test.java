package com.qa.tests;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class New555Test {
	
	WebDriver driver;	
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	
	
  @Test
  public void getTest() {
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(140, 130)", "");
	 	
			 
  }
  
  
  
  @Test
  public void get1Test() {
	  
	  
  }
  
  @Test
  public void get2Test() {
  } 
  @BeforeClass
  public void s() {
	  
	  driver=new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
			driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void t() {
	  driver.close();
  }

}
