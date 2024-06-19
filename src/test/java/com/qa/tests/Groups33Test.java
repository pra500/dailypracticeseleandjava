package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Groups33Test {
	
	//ll chk later
	 WebDriver driver;
		
	
	
  @Test(priority = 0)
  public void fTest() {
	  
	  
	  List<WebElement>list=driver.findElements(By.tagName("a"));
	  
//	  for(WebElement wb:list)
//	  {
//		  System.out.println(wb.getText());
//		  
//	  }
	  
	  
	  System.out.println(list.size());
	  
	  for(int i=0;i<=list.size()-1;i++)
	  {
		  System.out.println(list.get(i).getText());
	  }
	  
	  
	  
  }
  
  @Test(priority = 1)
  public void fiTest() {
  }
  
  @Test(priority = 2)
  public void fiiTest() {
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	   driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");	
		
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
