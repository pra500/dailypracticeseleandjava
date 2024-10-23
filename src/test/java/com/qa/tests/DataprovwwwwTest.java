package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovwwwwTest {
	
	
	WebDriver driver;
	
	
	
  @Test(dataProvider = "getdetails")
  public void fTest(String a, String b) {
	  
	  driver.findElement(By.id("username")).clear();
	  
	  driver.findElement(By.id("username")).sendKeys(a);
	  
	  driver.findElement(By.id("password")).clear();
	  
	  driver.findElement(By.id("password")).sendKeys(b);	 
	  
	    
	 
	  
	  
	  
  }
  
  
  
  
  
  @DataProvider
  public Object[][] getdetails()
  {
	
	  return new Object[][] {
		  
		  
		  {"dd", "gh@123"},
		  
		  {"xdd", "ff@1233"},
		  
		  {"rrrr", "poi%123"} 
		  
		  
	  };
	  
	  
  }
  
  
  
  

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
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
