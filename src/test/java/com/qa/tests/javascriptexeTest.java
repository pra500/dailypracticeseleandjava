package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class javascriptexeTest {
	
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  System.out.println( driver.getTitle());
	  //driver.getTitle()
  }
  
  
  @Test
  public void flTest() {
	  
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("document.getElementById('email1').value='pui@gmail.com';");
  }
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/login");	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  }

}
