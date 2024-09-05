package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class T55Test {
	
	
	WebDriver driver;	
	
	//https://www.globalsqa.com/demo-site/select-dropdown-menu/
	
	//select class all mtd's implement
	
	//all subheadings present/not
	
	
  @Test
  public void f1Test() {
	  
	  WebElement wb=  driver.findElement(By.xpath("//p//select"));
	  Select sel=new Select(wb);
	  sel.selectByVisibleText("")
	 
	  
	  
	
	  
	  
	 
  }
  
  @Test
  public void f2Test() {
	  
	  driver.get
  }
  
  @Test
  public void f3Test() {
	  
	  driver.get
  }
  @Test
  public void f4Test() {
	  
	  driver.get
  }
  @Test
  public void f5Test() {
	  
	  driver.get
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void afterClass() {
  }

}
