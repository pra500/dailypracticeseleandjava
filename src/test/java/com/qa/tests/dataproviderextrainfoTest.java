package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class dataproviderextrainfoTest {
	
	
	
	
	
	WebDriver driver;
	
	
	
  
  
  
	
  @Test(priority = 1)
  public void FtTest() {
	  
	 System.out.println(driver.getTitle());
	 
	  
  }
  
	
  @Test(dataProvider = "kTest", priority = 0)
  public void FuTest(String s, String s1) {
	  
	  
	  driver.findElement(By.id("email1")).sendKeys(s);		
	  driver.findElement(By.id("password1")).sendKeys(s1);	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  

  
  
  @DataProvider(name = "kTest")
  public Object[][]  meti()
  {
	  
	  Object[][] arr=new  Object[2][2] ;	  
	  
	  arr[0][0] = "prga";
	  arr[0][1] = "prga78@123";
	  arr[1][0] = "subn";
	  arr[1][1] = "subn@123456";	  
			  
	  return arr;
	  
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
