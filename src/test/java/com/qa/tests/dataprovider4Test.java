package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class dataprovider4Test {
	
	

	WebDriver driver;
	
	
	
  @Test(dataProvider = "f")
  public void f(String s, String s1) {
	 
	  driver.findElement(By.id("email1")).sendKeys(s);
	
	  driver.findElement(By.id("password1")).sendKeys(s1);  
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	  
	  
  }
  
  
  
  @DataProvider(name ="f")
  public Object[][] att()
  {
	  
	  Object[][] b=new Object[2][2];
	  
 b[0][0] = "pragti";
 b[0][1] = "pra16@1222";
  
 b[1][0] = "gupta";
 b[1][1] = "pra55@56";
 
 return b;
 	 
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/login");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
