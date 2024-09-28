package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeoptionsssssssTest
{
	
	WebDriver driver;
	
	
	
	
	
	
	
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  
	  }
  
  
	

	
  @Test
  public void fkkTest() {
	  
	  System.out.println(driver.getTitle());
	  
	  
	  }
  
  @Test
  public void flTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  
	  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {

	  FirefoxOptions fp=new FirefoxOptions();
	  
	  //fp.addArguments("incognito");
	  fp.addArguments("started-maximize");
	  
	    driver=new FirefoxDriver(fp);
	    
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
	  
  }
}
