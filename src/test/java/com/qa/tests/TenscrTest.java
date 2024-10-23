package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TenscrTest {
	
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

  @Test
  public void fTest() {
	  
	  System.out.println(  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).isDisplayed());
	   
	  
	//textarea[@id='APjFqb']
  }
  
  @Test
  public void f1Test() {
	  System.out.println(  driver.findElement(By.xpath("//a[text()='Images']")).isDisplayed());
	//a[text()='Images']
  }
  @Test
  public void f2Test() {
	  
	  System.out.println(  driver.findElement(By.xpath("  (//input[@value='Google Search'])[1]")).isDisplayed());
	 
  }
  
  @Test
  public void f3Test() {
	  
	  Assert.assertEquals(false, false);  }
  
  @Test
  public void f4Test() {
	  Assert.assertEquals(false, false); 
  }
  
  @Test
  public void f5Test() {
	  Assert.assertEquals(false, false); 
  }
  @Test
  public void f6Test() {
	  Assert.assertEquals(false, false); 
  }
}
