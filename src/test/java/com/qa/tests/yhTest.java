package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class yhTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	System.out.println(
	 driver.findElement(By.xpath("//legend[text()='Suggession Class Example']")).isDisplayed());
	  
	  

	
  }
  
  
  @Test
  public void f6Test() {
	  
	  
	  boolean b= driver.findElement(By.xpath("//input[@id='alertbtn']")).isDisplayed();
	  
	  System.out.println(b);
	  
	 
  }
  
  
  @Test
  public void ftTest() {
	  
 boolean b= driver.findElement(By.xpath("//input[@id='confirmbtn']")).isDisplayed();
	  
	  System.out.println(b);
  }
  
  
  
 // @Test
  public void ftttTest() {
	  
	  
  }
 
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	Set<Cookie>set1=driver.manage().getCookies();
	
	for(Cookie c:set1)
	{
		
		System.out.println(c.getName() + ":" + c.getValue());
		
	}
		
  
  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
