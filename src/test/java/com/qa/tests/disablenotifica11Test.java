package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.*;

public class disablenotifica11Test {
	
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
	String title=driver.getTitle();
	Assert.assertEquals(title,  "Your Store");
	  
  }
  
  
	
  @Test(enabled = true)
  public void ffrTest() {
	  
	  
 List<WebElement>	list=driver.findElements(By.cssSelector(".img-responsive"));
 System.out.println(list.size());
 
	  
  }
  
  
  
  
     
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--disable-notifications");
	  
	     
	    driver=new ChromeDriver(co);	  
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
