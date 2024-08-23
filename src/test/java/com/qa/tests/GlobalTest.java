package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GlobalTest {
	
	
	WebDriver driver;
	
	
  @Test(priority = 0)
  public void GGGTest() {
	  
	  /*
	   * 
	   * 
	   * 
	   * 
	   * verify logo
	   * verify title
	   * verify url
	   * verify about
	   * verify cheatsheets
	   */
	  
	boolean b=  driver.findElement(By.xpath("//img[@alt='GlobalSQA']")).isDisplayed();
	  Assert.assertTrue(b);
	  
  }
  
  @Test(priority = 1)
  public void eeTest()
  {
	  
	
	  
	  boolean b=  driver.findElement(By.xpath("//h1[normalize-space()='DropDown Menu']")).isDisplayed();	  
	  Assert.assertTrue(b);
  
  }
  
  
  @Test(priority = 2)
  public void ee3Test()
  {
	  String url=driver.getCurrentUrl();
	  Assert.assertEquals(url, "https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	  
	 
	  
  }
  
  @Test(priority = 3)
  public void ee52Test()
  {
	  driver.findElement(By.xpath("//li[@id='menu-item-53896']//a[normalize-space()='About']")).click();
	  boolean b=  driver.findElement(By.xpath("//h2[normalize-space()='My Story']")).isDisplayed();
	  Assert.assertTrue(b);
	  
  }
  
  @Test(priority = 4)
  public void ee332Test()
  {
	 
	  boolean b=   driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  }
  

  @Test(priority = 4)
  public void ee33Test()
  {
	 
	  boolean b=   driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  }
  

  @Test(priority = 4)
  public void ee331Test()
  {
	 
	  boolean b=   driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  }

  @Test(priority = 4)
  public void ee338Test()
  {
	 
	  boolean b=   driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  }

  @Test(priority = 4)
  public void ee33sTest()
  {
	 
	  boolean b=   driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  }
  

  @Test(priority = 4)
  public void ee333Test()
  {
	 
	  boolean b=   driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  }
  

  @Test(priority = 4)
  public void ee33wTest()
  {
	 
	  boolean b=   driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  }
  
  
 
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
}
