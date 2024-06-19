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

public class titleTest {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	  
	  
	  System.out.println(driver.getTitle());
	
  }
  
  
  @Test(dependsOnMethods = {"fTest"})
  public void fjkkTest() {
	  
	  
	List<WebElement>list=  driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	
	  
	
  }
  
  
  
  
  //@Test
  public void fjkkkTest() {
	  
	  
	  System.out.println(driver.getTitle());
	  //driver.getTitle();
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
  }

}
