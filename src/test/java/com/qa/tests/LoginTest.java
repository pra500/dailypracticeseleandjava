package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	
	WebDriver driver;
	
	
	
	
  @Test
  public void getTest() {
	  
	  
	  driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();	
	  
	  driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
	  
	  
	  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("justo@yahoo.com");
	  
	  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("juts@123");
	  
	  driver.findElement(By.xpath("//input[@value='Login']")).click();	
	  
	  
	  
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
