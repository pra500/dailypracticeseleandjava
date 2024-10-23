package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalendarpopupttTest {
	
	WebDriver driver;
	
  //@Test
  public void fTest() {
	  
	 boolean b= driver.getPageSource().contains("ca-pub-");
	System.out.println(b);
	 
	 
	 
  }
  
  
	
  //@Test(dependsOnMethods = {"fTest"})
  public void fjTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	 
	 //driver.findElement(By.xpath)
	 
  }
  
  
  
	
  //@Test(dependsOnMethods = {"fTest"})
  public void fjmmTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	 
	 
	 
  }
  
  
  
  //drop down---------------------------
	
  @Test
  public void dropdownTest() {
	  
	
	 System.out.println(driver.getCurrentUrl()); 
	// driver.getCurrentUrl()
	 
	 
  }
  
  
  

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=25_28&page=2");

	}

	
	@AfterClass
	public void afterClass() {

		driver.quit();
	}

}
