package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewtTest {
		
	
	WebDriver driver;	
	
	
  //@Test(priority = 0)
  public void fTest() {
	  
	  
	  System.out.println( driver.getCurrentUrl());
	 // driver.getCurrentUrl();
	  
  }
  
	
  //@Test(priority = 1)
  public void ifTest() {
	  	  
	  
	  System.out.println( driver.getCurrentUrl());
	 // driver.getCurrentUrl();
	  
  }
  
	
  @Test(priority = 2)
  public void iifTest() {
	  
	boolean b=  driver.findElement(By.xpath("(//li[starts-with(@class, 'ma')])[1]")).isDisplayed();
	  
	 System.out.println(b);
	  
	  //System.out.println( driver.getCurrentUrl());
	 // driver.getCurrentUrl();
	  
  }
  @BeforeClass
  public void beforeClass() {

	     driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);		
		driver.get("https://www.makemytrip.com/"); }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
