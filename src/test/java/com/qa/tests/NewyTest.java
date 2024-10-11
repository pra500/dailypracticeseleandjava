package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewyTest {
	
	
	
	WebDriver driver;
	
  @BeforeClass
  public void setuo() {
	  
	  
	  

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://app.dailyping.xyz/");

  }
  
  
  @Test
  public void geTest()
  {
	  String s=driver.getPageSource();
			  
			  System.out.println(s);
	 // driver.getPageSource();
  }
  
  
  
}
