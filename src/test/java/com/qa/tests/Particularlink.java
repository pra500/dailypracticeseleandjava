package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class Particularlink {
	
	
	WebDriver driver;
	
	
	@Test
	public void handleTest()
	{
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<=links.size()-1;i++)
		{
			String str=links.get(i).getText();
			if(str.equalsIgnoreCase("Home"))
			{
				System.out.println(str);
				break;
			}
			
		}
		
		
	
//**********	
		//**********		
		
		
		
	}

	
	
	 @BeforeClass
	  public void beforeClass() {
		  
		        driver=new ChromeDriver();		
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.get("https://practicetestautomation.com/practice-test-login/");
		  
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

}
