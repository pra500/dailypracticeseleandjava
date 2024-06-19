
package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ParallellllllTest {
	
	
	
	WebDriver driver;
	
	
	
	
  @Test
  public void fjTest() throws AWTException {
	  
	  
	  
	  
	  
	  Robot rb=new Robot();
	  rb.keyPress(KeyEvent.VK_TAB);
	  
	  
	  
  }
  
  @Test(dependsOnMethods = {"fjTest"})
  public void fkkTest() {
	  
	  
	  System.out.println(driver.getCurrentUrl());
	  //driver.getCurrentUrl();
	  
	  
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
