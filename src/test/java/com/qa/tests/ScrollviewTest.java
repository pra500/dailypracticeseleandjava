package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ScrollviewTest {
	
	//ll chk later
	
	WebDriver driver;
	
	
  @Test
  public void gtttTest() {
	  	  
	 	  
	  WebElement wb=driver.findElement(By.xpath("//button[@id='submit']"));	
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView()", wb);
  }
  
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		
		Thread.sleep(5000);
		
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
