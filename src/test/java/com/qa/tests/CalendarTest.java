package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CalendarTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
	  	  
	  
	  	  
	  	   
	 
  }
  
  
  @Test
  public void fkkTest() {
	  
	  driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
	  	  
	  
	//input[@id='first_date_picker']	  	  
	  	   
	 
  }
  
  
  @Test
  public void fkkr
  Test() {
	  
	  driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
	  	  
	  
	//input[@id='first_date_picker']	  	  
	  	   
	 
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
