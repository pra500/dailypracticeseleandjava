package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class lpTest {
	
	
	WebDriver driver;

  @Test
  public void fTest() {
	  
	  System.out.println(driver.getTitle());
	//driver.getTitle()
	
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
