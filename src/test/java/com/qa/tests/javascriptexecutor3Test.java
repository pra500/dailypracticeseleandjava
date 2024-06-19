package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class javascriptexecutor3Test {
	
	
	//need to chk again
	
	
	WebDriver driver;
	
 // @Test
  public void fTest() {
	  
	 String title= driver.getTitle();
	 Assert.assertEquals(title, "Your Store");	  
	  
  }
  
  //@Test
  public void f1Test() {
	  
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementsByName('search').values='iphone';");
	
	  
  }
  
  
  @Test
  public void f1ioTest() {
	  
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('search').values='iphone';");
	
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	 
  }

}
