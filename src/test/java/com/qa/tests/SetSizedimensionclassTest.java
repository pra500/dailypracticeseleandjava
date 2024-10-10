package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SetSizedimensionclassTest {
	
	
	WebDriver driver;
	
	//Dimension class is used for setting the size of window, our choice, width, hight
	//part of selenium, import org.openqa.selenium.Dimension  
	
	
	
  @Test
  public void fTest() {
	  System.out.println(driver.getTitle());
	 
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
		driver = new ChromeDriver();			
				
		
		Dimension d=new Dimension(200, 700);
		driver.manage().window().setSize(d);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
	  
  }

}
