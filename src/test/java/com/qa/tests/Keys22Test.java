package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Keys22Test {
	
	WebDriver driver;
	
	
  @Test(priority = 0)
  public void fTest() {
	  
	  
	  
	  
	  
  }
  
  @Test(priority = 1)
  public void f1Test() {
	  
	  
	  
	  
	  
  }
  
  @Test(priority = 2)
  public void f11Test() {
	  

	  
	boolean flag=  driver.findElement(By.xpath("//a[normalize-space()='Software']")).isDisplayed();
	  
	  System.out.println(flag);
	  
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  	  

	    driver=new ChromeDriver();	  
	  
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		 
			driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
