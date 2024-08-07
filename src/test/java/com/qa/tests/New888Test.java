package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class New888Test {
	
	WebDriver driver;
	
  @Test
  public void fTTest() {
	  
	  String title=driver.getTitle();
	  System.out.println(title);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/login");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
