package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class scrolltothebottomofthepageTest {
	
	WebDriver driver;
	
	
	
	//https://www.selenium.dev/documentation/webdriver/actions_api/wheel/  
	
	
	
	
  @Test
  public void fTest() throws InterruptedException {
	  
	  
	  
	  WebElement wb=driver.findElement(By.xpath("//a[normalize-space()='Gift Certificates']"));
	  	  
	  Actions act=new Actions(driver);
	  act.scrollToElement(wb).build().perform(); 
	    
	  	
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  
	 driver.close();
	  
  }

}
