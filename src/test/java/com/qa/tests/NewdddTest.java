package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewdddTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  driver.findElement(By.xpath("//p//select"));
  }
  

  @Test
  public void fjTest() {
	  
	  
	  driver.findElement(By.xpath("//p//select"));
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
