package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewdccTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  driver.getCurrentUrl();
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  	  

	    driver=new ChromeDriver();	  
	  
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 
			driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
