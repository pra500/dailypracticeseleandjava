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

public class NewdddddddddTest {
	
	
	WebDriver driver;
	
	
  //@Test
  public void getTest() {
	  
	  	  	  
	  System.out.println(driver.getTitle());
	 	  
	  
  }
  
  //@Test
  public void getiTest() {
	  
	  	  	  
	  System.out.println(driver.getTitle());
	 	  
	  
  }
    
  @Test
  public void getiiTest() {
	  	  	  	 
	List<WebElement>list=driver.findElements(By.xpath("//iframe | //frame"));	
	System.out.println(list.size());
	 	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
