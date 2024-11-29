package com.qa.tests;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Step;


public class BrokendddTest {

	
	WebDriver driver;

	
		
  @Test
  public void getlinksTest() {
	  
	  List<WebElement>list=driver.findElements(By.tagName("//a"));
	  System.out.println(list.size());
	  	  
	  
	  
	  
	  for(int i=0;i<=list.size()-1;i++)
	  {
		 WebElement wb= list.get(i);		 
		String s=wb.getAttribute("href");
				broke(s);
		
	  } 
	  
	  
  }
      
  
  
  public void broke(String s1)
  {
	  
	  
	  
	  
  }
  

  @BeforeTest
  public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/");
	}

  
  
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
