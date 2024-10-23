package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DataprovTest {
	
	
	WebDriver driver;
	

  @Test(dataProvider = "getdaaaaa")
  public void fTest(String us, String pw) {
	  
	  driver.findElement(By.id("username")).clear();
	  
	  driver.findElement(By.id("username")).sendKeys(us);
	  
	  driver.findElement(By.id("password")).clear();

	  driver.findElement(By.id("password")).sendKeys(pw);
	  

  }
  
  
  
  @Test(dataProvider = "mydata")
  public void fTest(String us, String pw) {
	  
	  driver.findElement(By.id("username")).clear();
	  
	  driver.findElement(By.id("username")).sendKeys(us);
	  
	  driver.findElement(By.id("password")).clear();

	  driver.findElement(By.id("password")).sendKeys(pw);
	  

  }
  
  @Test(dataProvider = "getdaaaaa")
  public void fTest(String us, String pw) {
	  
	  driver.findElement(By.id("username")).clear();
	  
	  driver.findElement(By.id("username")).sendKeys(us);
	  
	  driver.findElement(By.id("password")).clear();

	  driver.findElement(By.id("password")).sendKeys(pw);
	  

  }
  
  @Test(dataProvider = "getdaaaaa")
  public void fTest(String us, String pw) {
	  
	  
	  
	  driver.findElement(By.id("username")).clear();
	  
	  driver.findElement(By.id("username")).sendKeys(us);
	  
	  driver.findElement(By.id("password")).clear();

	  driver.findElement(By.id("password")).sendKeys(pw);
	  

  }
  
  
  
  
  
  
  @DataProvider
  public Object[][] getdaaaaa()
  {
	  return new Object[][] {
		  
		  
		  {"pargt", "dd@123"},
		  {"praaaa", "lj@1233"},
		  {"jklll", "op@123"}
	  };
	  
  }

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
