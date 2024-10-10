package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewyyyyyfffTest {
	
	
	
	WebDriver driver;
	
  @Test
  public void getTest() {
	  System.out.println();
	  boolean b=driver.getCurrentUrl().contains("g");
	  
	  System.out.println(b);
  }
  
  
  
  
  
	
  @Test
  public void getoTest() {
	  System.out.println();
	  boolean b=driver.getCurrentUrl().contains("g");
	  
	  System.out.println(b);
  }
  
  
	
  @Test
  public void getoooTest() {
	  System.out.println();
	  boolean b=driver.getCurrentUrl().contains("g");
	  
	  System.out.println(b);
  }
  @BeforeClass
  public void beforeClass() {
	  

	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
  
  

}
