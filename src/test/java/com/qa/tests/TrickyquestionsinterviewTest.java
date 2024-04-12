package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TrickyquestionsinterviewTest {
	
	
	
	
	
	//timeout ll wait till dat particular time  
		
	
	//@Test  (timeOut = 10)
	//org.testng.internal.thread.ThreadTimeoutException: Method com.qa.tests.TrickyquestionsinterviewTest.fTest() didn't finish within the time-out 10
	
	
	
	
	
	
	WebDriver driver;
	/*
	
  //@Test  (timeOut = 1000)  //5 secs wait
 // @Test  (timeOut = 10) 
	 @Test  (priority = 0, timeOut = 1000, description = "element checking")
  public void fTest() {
	
	  Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='header']")).isDisplayed());
	  
	  
  }
  
  */
	
	
	
	 
	 //-----------testng grouping----------
	 
	 
	 @Test(groups = {"sanity"})
	 public void ag()
	 {
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='header']")).isDisplayed());
		 
		 
	 }
	 
	 @Test(groups = {"sanity"})
	 public void agi()
	 {
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='header']")).isDisplayed());
		 
		 
	 }
	 
	 @Test(groups = {"sanity"})
	 public void agii()
	 {
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='header']")).isDisplayed());
		 
		 
	 }
	 @Test(groups = {"smoke"})
	 public void agiii()
	 {
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='header']")).isDisplayed());
		 
		 
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
