package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproTest {
	
	WebDriver driver;
	
  @Test(dataProvider = "geteee")
  public void fTest(String s, String s1) {
	  
	  
	  driver.findElement(By.id("email1")).sendKeys(s);
	
	  driver.findElement(By.id("password1")).sendKeys(s1);  
	  
  }
  
  
  
  
  
  
  @DataProvider
  public Object[][] geteee()
  {
	  return new Object[][] {
		  
		  {"dsc", "sdc@123"}, 
		  {"dsc1", "sdc@1231"}, 
		  {}
		  
		  
		  
	  };
  }
  

  
  @BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
