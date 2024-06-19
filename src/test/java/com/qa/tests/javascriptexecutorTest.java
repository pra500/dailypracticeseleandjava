package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class javascriptexecutorTest {

	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	  
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(200, 300)", "");
	  
	  
	  
	  JavascriptExecutor js1=(JavascriptExecutor)driver;
	  js1.executeScript("document.getElementById('cart-total').click();");
	  
	  
	  
	  
	  
	  
	
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
	  
	  driver.close();  
	  
  }

}
