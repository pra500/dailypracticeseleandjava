package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class normalizeTest {
	
	
	WebDriver driver;

	
	
  @BeforeClass
  public void setup()
	  
	  	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
  }
  

	
  @Test
  public void fiTest() {
	 
	  String title=  driver.getCurrentUrl(); 
	 System.out.println(title);
	 
		
  }
  
	
  @Test
  public void fijTest() {
	 
	  String title=  driver.getCurrentUrl(); 
	 System.out.println(title);
	 
		
  }
  
  
  
  @Test
  public void fidTest() {
	  
	  String title=  driver.getTitle();	  
	 System.out.println(title);
	 
		
  }
  @Test
  public void fidddTest() {
	  
	  String title=  driver.getTitle();	  
	 System.out.println(title);
	 
		
  }
  

  @AfterClass
  public void teardown()
  {
	  
	  driver.close();
	  
	  
  }
}
