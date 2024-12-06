package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetAttributeTest {
	
	WebDriver driver;
	
  @Test(priority = 0)
  public void fTest() {
	  
	  
	  //dropdown-toggle
	  String s=driver.findElement(By.xpath("//a[text()='Components']")).getAttribute("class");
		System.out.println(s);	  
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
