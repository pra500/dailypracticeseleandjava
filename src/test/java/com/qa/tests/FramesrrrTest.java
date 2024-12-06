package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FramesrrrTest {
	
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  String title=  
				 driver.getTitle();
	  
	
	  
	
System.out.println(title);
	  
	 
  
  
  }
  
  
  @BeforeClass
  public void beforeClass() {
    
       
      driver=new ChromeDriver();	  
      driver.manage().window().maximize();
  	driver.manage().deleteAllCookies();
  	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
  	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  	driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
  }

  
  
  @AfterClass
  public void afterClass() {
    
    driver.close();
  }
}
