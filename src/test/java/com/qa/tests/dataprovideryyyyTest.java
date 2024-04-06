package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class dataprovideryyyyTest {
	
	
	
	
	WebDriver driver;
	
  @Test(dataProvider = "nest")
  public void fTest(String s, String s1) {
	  
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(s1);	  
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  
  }
    
  
  @DataProvider(name = "nest")
  public Object[][] gee() 
  {
	  Object[][] arr=new Object[2][2];
	  
	  arr[0][0] = "tom";
	  arr[0][1] = "cv@123"; 
	  arr[1][0] = "peter";
	  arr[1][1] = "hj@1234";  
	  
	  return arr;
  }
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	        driver=new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://practicetestautomation.com/practice-test-login/");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
