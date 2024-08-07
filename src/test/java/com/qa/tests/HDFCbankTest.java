package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HDFCbankTest {
	
	//need to chk again
	
	public static WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getTitle());
	  getii();
  }
  
  
  
  
  public static void getii()
  {
	  
	  
	  System.out.println( driver.findElement(By.xpath("//a[text()='CONTINUE']")).isDisplayed());
	
	  
	  
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
}

}
