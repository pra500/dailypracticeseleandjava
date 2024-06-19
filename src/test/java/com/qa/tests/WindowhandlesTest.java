package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class WindowhandlesTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	     driver.findElement(By.id("openwindow")).click();
	 
	 
	          Set<String>set1=driver.getWindowHandles();   
	          Iterator<String>itr=set1.iterator();
	          String parent=itr.next();	      
	          String child=itr.next();
	          
	          driver.switchTo().window(child);
	          String title=driver.getTitle();
	          Assert.assertEquals(title, "QAClick Academy - A Testing Academy to Learn, Earn and Shine");
	          
	          driver.close();	
	          driver.switchTo().window(parent);
	          
		      String parentwindtitle=driver.getTitle();
		      
		      Assert.assertEquals(parentwindtitle, "Practice Page");
		      
	          
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
