	package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class alllinksTest {
	
	WebDriver driver;
	
  @Test
  public void fyyTest() {
	  
	  
	  
	WebElement wb=driver.findElement(By.id("submit"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(130, 140)", "");
	
	js.executeScript("arguments[0].click();", wb);
	
  }
  
  
  @Test
  public void kkkTest() {
	  
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('password').value='Password123';");
	  
  }
  
  @Test
  public void flTest() {
	  
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('username').value='student';");
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  	  

	    driver=new ChromeDriver();	  
	  
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 
			driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
