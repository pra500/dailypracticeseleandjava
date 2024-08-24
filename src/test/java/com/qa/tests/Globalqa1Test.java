package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Globalqa1Test {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getTitle());
	
	  
	  }
  @BeforeClass
  public void beforeClass() {
	  	
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
