package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SearchTest {
	
		
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
	  
	String title=driver.getTitle();
	
	Assert.assertEquals(title, "Search - apple");	  
	  
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
