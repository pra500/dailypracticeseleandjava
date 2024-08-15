package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ListenerrrTest {
	
	
	WebDriver driver;
	
	


	  @Test
	  public void fTest() {
		  
		  System.out.println( driver.getPageSource());
		  
		 // driver.getPageSource()
		  
		  
	  }

	  //@Test
	  public void fkkTest() {
		  
		driver.findElements(By.xpath("//input"));
		  
		 // driver.getPageSource()
		  
		  
	  }

	  //@Test
	  public void fkTest() {
		  
		  System.out.println( driver.getPageSource());
		  
		 // driver.getPageSource()
		  
		  
	  }
	  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();  }

}
