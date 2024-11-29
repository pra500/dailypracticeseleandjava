package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MakeTest {
	
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  driver.findElement(By.cssSelector(null));
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
}
