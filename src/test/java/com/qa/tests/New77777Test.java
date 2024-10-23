package com.qa.tests;

import org.testng.annotations.Test;

public class New77777Test {
	
	
	WebDriver driver;
  @Test
  public void f() {
	 
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
