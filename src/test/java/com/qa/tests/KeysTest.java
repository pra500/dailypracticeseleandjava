package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeysTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
	
	  
	  
	  driver.findElement(By.xpath("//button[text()='Open Window']")).sendKeys(Keys.ENTER, Keys.TAB);
	  
  }
  

  
  
  
  
 	@BeforeClass
 	public void setup() {

 		driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
 		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 	}

 	@AfterClass
 	public void teardown() {

 		driver.close();
 	}

  
  
  
}
