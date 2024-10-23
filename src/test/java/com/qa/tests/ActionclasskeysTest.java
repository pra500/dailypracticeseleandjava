package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionclasskeysTest {
	
	
	WebDriver driver;
	
	
  //@Test
  public void sendkeyssssTest() {
	  
	  WebElement wb= driver.findElement(By.xpath("//input[@id='username']"));
	 
	  
	  WebElement wb1= driver.findElement(By.xpath("//input[@id='password']"));
	    
	  
	  Actions act=new Actions(driver);
	  
	  
	  wb.clear();
	  act.sendKeys(wb,"java").build().perform();
	  
	  wb.sendKeys(Keys.CONTROL, "a");
	  wb.sendKeys(Keys.CONTROL, "c");
	  
	  wb1.sendKeys(Keys.CONTROL, "v");    
  }
  
  
  
 //@Test
  public void keyupandkeydownTest() {
	  


	  
	
  }
  
  

  @BeforeClass
  public void beforeClass() {

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
	  
  }

}
