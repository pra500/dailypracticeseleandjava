package com.qa.tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class RandompopuphandlingTest {
	
		
	//handled starting pop up also
	//accept cookies also i clicked, Got it ! remains in the DOM only, u need to search it 
	
	
	
	public static WebDriver driver;		
	
	
	
	
	
  @Test
  public void RandomTest() throws InterruptedException {
	  if(randompo())
	  {
		  
		  driver.switchTo().alert();
		  driver.switchTo().alert().accept();
		  driver.switchTo().defaultContent();
		  
	  }
	  
	  driver.findElement(By.xpath("//button[normalize-space(text())='Got It !']")).click();	  
	  boolean flag=driver.findElement(By.xpath("//a[@href='https://www.geeksforgeeks.org/learn-data-structures-and-algorithms-dsa-tutorial/?ref=shm']")).isDisplayed();
	  Assert.assertTrue(flag);
	  	   
	  //*  	  
	}
  
    
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.geeksforgeeks.org/reverse-string-preserving-space-positions/");
		
		
	  
  }
  
  
  public static boolean randompo()
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

  @AfterClass
  public void afterClass() {
	  driver.close();
}
  
  
  
  
  


}
