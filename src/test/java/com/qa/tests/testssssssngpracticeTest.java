package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testssssssngpracticeTest {
	
	 WebDriver driver;
	 
  @Test
  public void fTest() {
	  
	  
	boolean b=  driver.findElement(By.xpath("//a[normalize-space()='Software']")).isDisplayed();
System.out.println(b);
  }
  
  @Test
  public void fiTest() {
  }
  
  @Test
  public void fiiTest() {
  }
  
  
  @Test
  public void fiiiTest() {
  }
  @Test
  public void fiiiiTest() {
  }
  
  @Test
  public void fllllTest() {
  }
    
  

  @BeforeClass
  public void beforeClass() {
	  
	  
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--disable-notifications");
	  
	     
	    driver=new ChromeDriver(co);	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }
}
