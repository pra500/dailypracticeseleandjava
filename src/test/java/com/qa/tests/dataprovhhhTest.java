package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovhhhTest {
	
	WebDriver driver;
	
  @Test(dataProvider = "aa")
  public void fTest(String u, String p) {
	  driver.findElement(By.id("username")).clear();
	  
	  driver.findElement(By.id("username")).sendKeys(u);
	  
	  driver.findElement(By.id("password")).clear();
	  
	  driver.findElement(By.id("password")).sendKeys(p);
	  
  }
  
  
  
  
  
  
  
  @DataProvider  
  public Object[][] aa()
  {  
	  
	  return new Object[][] {	 
		  
		  
		  {"pra", "dsdcd"},
		  {"pik", "xcc"},
		  {"yu", "sdsvcv"},
		  {"yuj", "sdsvcvl"},
		  {"yuaa", "sdsvcvaa"},
		  {"yuyy7", "sdsvcv7"},
		  {"yuyy0", "sdsvcv0"},
		  
		  {"yuyy7xx", "sdsvcv0x"},
		  {"yuyytts", "sdsvcv0uuu"},
		  
	  };
	  
  }  
    

  @BeforeClass
  public void setup()
  {
	  
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/login");
  }
  
  @AfterClass
  public void teardown()
  {
	 driver.close(); 
  }
}
