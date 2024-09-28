package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NewggTest {
	
	
	
	

	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	 
	  System.out.println(driver.getTitle());
	 
  }
  
  
	
  @Test
  public void getURLTest() {
	  
	  
	String url=driver.getCurrentUrl();
	
	System.out.println(url);
	 
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();		
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
