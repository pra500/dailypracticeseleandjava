package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CartTest {
	
	
	
	WebDriver driver;
	
  //@Test
  public void fTest() {	  
	  
	  
	  driver.findElement(By.xpath("//span[normalize-space()='Shopping Cart']")).click();
	  
	  driver.findElement(By.xpath("//h1[normalize-space()='Shopping Cart']")).click();
	
  }
  
  

  @Test
  public void foolTest() {	  
	  
	  
	
	
  }
  
	
  @Test
  public void fooyTest() {	  
	  
	  
	
	
  }
  
	
  @Test
  public void foooTest() {	  
	  

	boolean b=  driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
	  
	System.out.println(b);
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	     
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  	  
  }

 
  
  
}
