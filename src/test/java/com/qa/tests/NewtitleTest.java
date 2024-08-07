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

public class NewtitleTest {
	
	

	WebDriver driver;
  @Test
  public void fjTest() {
	  
	  
	  
	//List<WebElement>list=driver.findElements(By.cssSelector("#dropdown-class-example"));
			  
			//System.out.println(list.size());
			  
		//list.size()
	
			  
			  
  }
  
  
  //@Test
  public void fiTest() {
	  
	 
	  
	

  }
  
  
  //@Test
  public void fTest() {
	  
	  System.out.println(driver.getTitle());
	  //driver.getTitle();
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
		//for toleftof and torightof:
		//driver.get("https://practicetestautomation.com/practice-test-login/");	
		
		//for near:
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  }

}
