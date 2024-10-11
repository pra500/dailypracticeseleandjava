package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NeweTest {
	
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	boolean b=  driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
	  System.out.println(b);
	//button[@type='submit']
  }
  
  @Test
  public void frTest() {	
  }
  
  
  @Test
  public void fttTest() {	
  }
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  	  

	    driver=new ChromeDriver();	  
	  
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		 System.out.println(	driver.manage().getCookies());
			//driver.manage().getCookies();
			 driver.manage().window().maximize();
			 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
