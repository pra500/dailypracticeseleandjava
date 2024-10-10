package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Desiredcapability111Test {
		
	WebDriver driver;
	
  @Test
  public void fTest() {
  }
  @BeforeClass
  public void beforeClass() {
	  
	  DesiredCapabilities des=new DesiredCapabilities();
	  des.setCapability("browsername", "chrome");
	  des.setCapability("platform", "windows");
	  des.setCapability("version", "117");
	  
	  
	  driver = new ChromeDriver(des);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
	  
	  
  }
  
  

  @AfterClass
  public void afterClass() {
  }
  
  

}
