package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class New66Test {
	
	
	WebDriver driver;
	
	
	@Test
  public void FTest()   
  {
	  System.out.println(driver.getPageSource());
	 }
  
  @Test
  public void FrTest() {
	  
	  System.out.println( driver.getTitle());
	  
  }
  
  @Test
  public void FeeTest() {
	  
	  
	  System.out.println(driver.getWindowHandle());
	  //driver.getWindowHandle();
  }
  
  @Test
  public void F77Test() {
	  
	  int ddd=driver.hashCode();
	  System.out.println(ddd);
	  
  }
  
  
  
  
  @Test
  public void F77iTest() {
	  
	  
	  
	 
	  
  }
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.makemytrip.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
