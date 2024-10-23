package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2222Test {
	
	
	
	WebDriver driver;
	
		
	
	
  @Test(dataProvider = "data1")
  public void fTest(String us, String pw) { 
	  
	  
	  
	  driver.findElement(By.id("username")).clear();
	  
	  driver.findElement(By.id("username")).sendKeys(us);
	  	  
	  
	  driver.findElement(By.id("password")).clear();
	  
	  driver.findElement(By.id("password")).sendKeys(pw);
	  	  
	  
	  
  }
  
  
  @Test
  public void frTest() {
	  
  }
  
  
  
  
  @DataProvider
  public Object[][] data1()
  {	  
	  
	  return new Object[][] {
		  
		  
		  {"practice","SuperSecretPassword!"},
		  {"practice1", "SuperSecretPassword!1"},
		  {"practice2", "SuperSecretPassword!2"}
		  
		  
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
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }
  
  @AfterClass
  public void teardown()
  {
	 driver.close(); 
  }
}
