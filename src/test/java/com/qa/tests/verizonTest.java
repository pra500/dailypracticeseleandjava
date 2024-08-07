package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class verizonTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	
	  
	 boolean b= driver.findElement(By.xpath("//button[@id='gnav20-Shop-L1']")).isDisplayed();
	  System.out.println(b);
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.verizon.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


}
