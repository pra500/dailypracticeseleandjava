package com.qa.tests;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import java.util.*;


public class RTest {
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
	List<WebElement>list=  driver.findElements(By.tagName("img"));
	
    System.out.println(list.size());


	  
  }
  @BeforeClass
  public void beforeClass() {
	  
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
