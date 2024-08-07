package com.qa.tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class today28marchTest {
	
	

	WebDriver driver;
	
	
	
  @Test
  public void setTest() {
	  
	  
	 /* 
	  driver.findElement(By.xpath("//span[normalize-space()='Shopping Cart']")).click();	  
	  boolean b=driver.findElement(By.xpath("//span[normalize-space()='Shopping Cart']")).isDisplayed();
	  System.out.println(b);
	*/  
	  
	  WebElement wb= driver.findElement(By.xpath("//span[normalize-space()='Shopping Cart']"));	 
	 
	  //new syntax:
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(12));
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Shopping Cart']"))).click();	  
	 
	 
	    
	//old syntax:  WebDriverWait wait = new WebDriverWait(driver,10);
	
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



