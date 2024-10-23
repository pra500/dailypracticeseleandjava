package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Data1Test {
	

	WebDriver driver;
	

  @Test(priority = 0, dataProvider = "ourdata1")
  public void gTest(String s, String sss)
  {
	  
	driver.findElement(By.cssSelector("#email1")).clear();	  
	  
	driver.findElement(By.cssSelector("#email1")).sendKeys(s);
	
	
	driver.findElement(By.cssSelector("#password1")).clear();
	
	driver.findElement(By.cssSelector("#password1")).sendKeys(sss);
	  
	 
	
  }

  
  
  
  
  
  
  
  
  @Test(priority = 1, dataProvider = "datatakeee")
  public void fuhTest(String uss, String pww) {
	  
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	driver.findElement(By.id("username")).clear();
	  
	driver.findElement(By.id("username")).sendKeys(uss);
	
	driver.findElement(By.id("password")).clear();
	
	driver.findElement(By.id("password")).sendKeys(pww);
	
	
	  
  }
  
  
  
  
  
  

@DataProvider
public Object[][] ourdata1()
{
	
return new Object[][] {
	
	{"tomaxxxxx@gmail.com", "prag#123"},	
	{"tomaxxsxxx@gmail.com", "prag#@d123"},
	{"po9w@gmail.com", "sdc@1233"}
	
	
};


}





@DataProvider
public Object[][] datatakeee()
{
	return new Object[][] {
		{"psso", "po#12222"},	
		{"stro", "pui@123"}, 
		{"nsddc", "ioop@123"}
		
	};
	
}



  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/login");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
