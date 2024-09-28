package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;

public class EdgeOptionsTest {
	
	
	WebDriver driver;	
	
  @Test
  public void fTest() {
	  
	String url=driver.getCurrentUrl();	
	System.out.println(url);
	  
  }
  
  @Test
  public void feeTest() {
	  
	String url=driver.getCurrentUrl();	
	System.out.println(url);
	  
  }  
  
  
  @BeforeClass
  public void beforeClass() {
	EdgeOptions ed=new EdgeOptions();
	//ed.addArguments("incognito");
	ed.addArguments("start-maximized");
	
	ed.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));	
	  
	    driver=new EdgeDriver(ed);  
	    //driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
	  
	  
	  
	  
  }

}
