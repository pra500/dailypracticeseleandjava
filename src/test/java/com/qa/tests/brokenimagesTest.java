package com.qa.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brokenimagesTest {
	
	
	WebDriver driver;
	
	
	
	
  @Test
  public void fTest()
  {
	  
	  driver=new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
			
			
			
					  
		List<WebElement> list= driver.findElements(By.tagName("a"));
		  System.out.println(list.size());
	  		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
}
