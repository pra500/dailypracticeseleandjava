package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CookieshowtohandleTest {
	
	WebDriver driver;
	
	
  @Test
  public void gTest() {
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		driver.get("https://www.scrapingcourse.com/ecommerce/");
		
          Set<Cookie>set1=driver.manage().getCookies();
          
          int size=set1.size();
		
		System.out.println(size);
		
		
		for(Cookie c:set1)
		{
			System.out.println(c.getName()+ ":" +c.getValue());
		
		}
		

	 
  }
  
  
  

}
