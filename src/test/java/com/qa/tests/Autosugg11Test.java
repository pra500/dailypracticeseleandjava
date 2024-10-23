package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Autosugg11Test {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	  
	  
	  
	driver.findElements(By.tagName("a"));
	  
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }


}
