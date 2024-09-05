package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class keysclasspracticeTest {
	
	

	WebDriver driver;

  @Test(groups = "sanity")
  public void fTest() {
	//a[@class='btn btn-sut mb-3 mt-0 mt-lg-3']
	  
		  driver.findElement(By.xpath("//a[normalize-space()='Automation Training']")).sendKeys(Keys.ENTER);
		  
		  //driver.findElement(By.xpath("//a[@class='btn btn-sut mb-3 mt-0 mt-lg-3']"))
		  
		  //.sendKeys(Keys.c);
		  
		  
		  
		  
  }
  

  @Test(dependsOnGroups = {"fTest"})
  public void fuTest() {
	  
	  
	
		  
  }
  
  @BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
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
