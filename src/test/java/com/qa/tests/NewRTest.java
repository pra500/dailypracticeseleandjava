package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewRTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	WebElement wb=  driver.findElement(By.xpath("//input[@id='password']"));
	wb.sendKeys("chi@1234");
	wb.sendKeys(Keys.CONTROL, "a");
	
	wb.sendKeys(Keys.CONTROL, "c");
	
  }
  
  

  @BeforeClass
  public void beforeClass() {

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/login");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
}
