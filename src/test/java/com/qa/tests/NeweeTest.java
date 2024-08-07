package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NeweeTest {
	
	WebDriver driver;
		
  
  
  @Test(priority = 1)
  public void fgTest() {
	  
	  
	String str= driver.getWindowHandle();
	System.out.println(str);
	 
	
	
	
	
	  
  }
  
 
 
  @BeforeClass
  public void beforeClass() {	  
	  

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
