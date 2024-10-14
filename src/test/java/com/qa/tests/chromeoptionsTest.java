package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class chromeoptionsTest {
	
			
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	 	boolean b=driver.findElement(By.cssSelector("#first_date_picker")).isDisplayed();	 	
	 	System.out.println(b);
	  
  }
  
    
  @Test
  public void jfTest() {
	  
		boolean b=driver.findElement(By.cssSelector("#second_date_picker")).isDisplayed();	 	
	 	System.out.println(b);
	  
	  
  }
  
  //@Test
  public void fkkTest() {
	  
	 	 System.out.println(driver.getWindowHandles());
	  
  }
  
  
  //@Test
  public void fkk12Test() {
	  
	  System.out.println(driver.getTitle());
	
	  
  }
  
 // @Test
  public void fkk13Test() {
	  
	 	 System.out.println(driver.getTitle());
	  
  }
  
  @Test
  public void fkk14yTest() {
	  
	 	 System.out.println(driver.getWindowHandle());
	 	 
	  
  }
  

  @Test
  public void fkk14ttTest() {
	  
	 	 System.out.println(driver.getWindowHandle());
	 	 
	  
  }
  

 // @Test
  public void fkk14ttTest() {
	  
	 	 System.out.println(driver.getWindowHandle());
	 	 
	  
  }
  

  //@Test
  public void fkk14Test() {
	  
	 	 System.out.println(driver.getWindowHandle());
	 	 
	  
  }
  
  
  @Test
  public void fkkk14Test() {
	  
	 	driver.get("https://naveenautomationlabs.com/opencart/"); 
	 	
	 	
	 	String s=driver.getWindowHandle();
	 	
	 	System.out.println(s);
	 	if(s=="CB469CFF35C95E11EAB39C82A56944E5")
	 	{
	 		System.out.println("yes");
	 	}
	 	
	 	else
	 		
	 	{
	 		System.out.println("no");
	 	}
	 	
	 	}
  
  @BeforeClass
  public void beforeClass() {

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
	  
  }

}
