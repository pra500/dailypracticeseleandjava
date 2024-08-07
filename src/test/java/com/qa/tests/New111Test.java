package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class New111Test {
		
	WebDriver driver;
	
	
  @Test()
  public void fkTest() {
	  
	 List<WebElement> list=driver.findElements(By.tagName("//a"));
	 System.out.println(list.size());
	 
  }
  
	
  //@Test(priority = 1)
  public void fllTest() {
	  List<WebElement> list=driver.findElements(By.tagName("//a"));
		 System.out.println(list.size());
  }
  
	
 // @Test
  public void ffffTest() {
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");

  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  }

}
