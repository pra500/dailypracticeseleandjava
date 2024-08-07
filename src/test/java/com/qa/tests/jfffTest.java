package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class jfffTest {
	
	
	
	WebDriver driver;
	
  
  @Test (priority = 0, expectedExceptions = ArithmeticException.class, timeOut = 2000)
  public void getgeteeTest() {
	  
	  

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");  
		
	 boolean flag=driver.findElement(By.xpath("//h3[normalize-space()='Log in']")).isDisplayed();		
	  
		Assert.assertTrue(flag);
		
		int a=18;
		if(a/0==2)
		{
			System.out.println("th");
		}
		else
		{
			System.out.println("th 1");
		}
		
		
		 driver.close();
		 
	  
		 
	  
	  
  }
}
