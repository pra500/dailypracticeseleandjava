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

public class NewhTest {
	
	
	public static WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  if(ran())
	  {
		  driver.switchTo().alert();
		  driver.switchTo().alert().accept();
		  driver.switchTo().defaultContent();
	  }
	  
	  
	List<WebElement>list=  driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	  
	  
  }
  
  
  public static boolean ran()
  {
	  try
	  {
		  
		  driver.switchTo().alert();
		  return true;
	  }
	  catch(Exception e)
	  {
		  return false;
	  }
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
