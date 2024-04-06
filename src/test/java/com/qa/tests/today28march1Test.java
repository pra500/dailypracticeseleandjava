package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class today28march1Test {
	
	
	WebDriver driver;
	
	
	
	
	
	
  @Test
  public void setTest() {
	  
	  driver.findElement(By.xpath("//span[normalize-space()='Checkout']")).click();	  
	boolean b=driver.findElement(By.xpath("//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")).isDisplayed();
    System.out.println(b);
  
  
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
