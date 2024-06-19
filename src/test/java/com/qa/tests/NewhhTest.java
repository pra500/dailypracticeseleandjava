package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewhhTest {
	
	
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {

	  String text=driver.findElement(By.xpath("//img[@src='https://naveenautomationlabs.com/opencart/image/catalog/opencart-logo.png']"))
	  .getText();
	  System.out.println(text);
	  
	  
  }
  
	
  //@Test
  public void fjhTest() {
	  
	  

	
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
