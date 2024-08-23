package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class chromeoptionsTest {
	
			
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	 	 System.out.println(driver.getClass());
	  
  }
  
    
  @Test
  public void jfTest() {
	  
	 	 System.out.println(driver.getTitle());
	  
  }
  
  @Test
  public void fkkTest() {
	  
	 	 System.out.println(driver.getWindowHandles());
	  
  }
  
  
  @Test
  public void fkk12Test() {
	  
	  System.out.println(driver.getTitle());
	
	  
  }
  
  @Test
  public void fkk13Test() {
	  
	 	 System.out.println(driver.getTitle());
	  
  }
  
  @Test
  public void fkk14Test() {
	  
	 	 System.out.println(driver.getWindowHandle());
	 	 
	  
  }
  
  @BeforeClass
  public void beforeClass() {

	    driver=new ChromeDriver();	  
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
