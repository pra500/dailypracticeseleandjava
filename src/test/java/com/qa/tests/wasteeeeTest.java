package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class wasteeeeTest {
	
	
	WebDriver driver;
	
  //@Test
  public void fTest() {
	  
	  System.out.println(driver.getTitle());
	 // String str=driver.getTitle();
	 
	
	  
  }
  
	
  //@Test
  public void ffTest() {
	  
	  System.out.println(driver.getTitle());
	 // String str=driver.getTitle();
	 
	
	  
  }
  
	
  @Test
  public void fhhTest() {
	
	  
	  List<WebElement>list=
	 driver.findElements(By.tagName("img"));
	  
	  System.out.println(list.size());
	 
	 
	
	  
  }
  
	
  @Test
  public void fhhiTest() {
	
	  
	  List<WebElement>list=
	 driver.findElements(By.tagName("iframe"));
	  
	  System.out.println(list.size());
	 
	 
	
	  
  }
  
	
  @Test
  public void fhjhTest() {
	
	  
	  List<WebElement>list=
	 driver.findElements(By.tagName("input"));
	  
	  System.out.println(list.size());
	 
	 
	
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  //ChromeOptions ch=new ChromeOptions();
	 // ch.addArguments("--disable-notifications");
	  
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
