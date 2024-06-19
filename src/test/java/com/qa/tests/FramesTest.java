package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class FramesTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  //driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//ul[@class='navigation clearfix']")).click();
	  
	  
	  driver.switchTo().frame("iframe-name");
	  
	  boolean b=driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).isDisplayed();
	  Assert.assertEquals(b,  true);
	  
	  driver.switchTo().defaultContent();
	  
	 String text= driver.findElement(By.xpath("//button[text()='Mouse Hover']")).getText();
	  System.out.println(text);	  
	  
	    
	  
	  
	  
  }
  
  //@Test
  public void fiTest() {
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
