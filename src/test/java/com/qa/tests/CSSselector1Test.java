package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CSSselector1Test {
	
	WebDriver driver;
	
	
  @Test(priority = 0)
  public void fTest() {
	 
	  
	boolean b=  driver.findElement(By.cssSelector("img[alt='Make My Trip']")).isDisplayed();
	  Assert.assertEquals(b,  true);
  }
  
  
  
 // @Test(priority = 1)
  public void fiTest() {
  }
  
  
 // @Test(priority = 2)
  public void fiiTest() {
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
  }
  
  
  
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  

}
