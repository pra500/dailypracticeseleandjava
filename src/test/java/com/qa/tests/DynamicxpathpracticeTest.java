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

public class DynamicxpathpracticeTest {
	
	WebDriver driver;

  
  @Test
  public void flTest() {
	// driver.findElement(By.xpath("//h2[contains(text(), 'Test login')]"))
	  
	//h2[contains(text(), 'Test login')]
	  
	//b[contains(text(), 'Password123')]
	  
	  (//b[contains(text(), 'Password123')])[1]
	
	//section[starts-with(@id, 'lo')]
			  
			  
			//header[contains(@id, 'site-')]
			  
	  
	  
			  //(//*[contains(text(), 'Practice')])[1]
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  	  

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
