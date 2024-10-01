package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CssselectorsTest {
	
	WebDriver driver;
  @Test
  public void fidTest() {
	  
	 boolean b= driver.findElement(By.cssSelector("input#username")).isDisplayed();
	 Assert.assertTrue(b);
	 
	 
	 
	
	  
  }
  
  @Test
  public void fotherattributesTest() {
	  
	  boolean b= driver.findElement(By.cssSelector(".header-middle")).isDisplayed();
		 Assert.assertTrue(b);
		 
	  
  }
  
  @Test
  public void fclassnameTest() {
	  
	  boolean b= driver.findElement(By.cssSelector("ul>li:nth-child(3)")).isDisplayed();	  
	  Assert.assertTrue(b);
  }
  
  
  
  @Test
  public void findexTest() {
	  
	  
	  
	  boolean b= driver.findElement(By.cssSelector("ul#menu-primary-items>li:nth-child(3)")).isDisplayed();
	  Assert.assertTrue(b);

  }
  
  
  
  
  @Test
  public void findex1Test() {
	   
	  
	  
	  boolean b= driver.findElement(By.cssSelector("section#login")).isDisplayed();
	  
	  Assert.assertTrue(b);
  }	
  
  
  @Test
  public void findex2Test() {
	  
	  
	  boolean b= driver.findElement(By.cssSelector("section#login>h2")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  
	  }	
	
  
  
  @Test
  public void findexs2Test() {
	  
	  
	  boolean b= driver.findElement(By.cssSelector("section#login>h2")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  
	  }	
  
  @Test
  public void findexss2Test() {
	  
	  
	  boolean b= driver.findElement(By.cssSelector("section#login>h2")).isDisplayed();
	  Assert.assertTrue(b);
	  
	  
	  }	  
  
  @Test
  public void eeeTest() throws InterruptedException {
	  
	  //ll chk below later
	  
	  
	  
	  //boolean b= driver.findElement(By.cssSelector("button[aria-expanded=false]")).isDisplayed();
	  
	  //Thread.sleep(4000);
	  
	  boolean b= driver.findElement(By.cssSelector("link[rel='apple-touch-icon']")).isDisplayed();
	  Assert.assertTrue(b);
	  
  }	  
	  
	@Test
	  public void findexsss2Test() {	
		  
		  
		  boolean b= driver.findElement(By.cssSelector("section#login>h2")).isDisplayed();
		  Assert.assertTrue(b);
		  
		  
		  }	
  
  
  @Test
  public void findex3Test() {
	  
	  boolean b= driver.findElement(By.cssSelector("div#menu-primary>nav")).isDisplayed();
	 
	  Assert.assertTrue(b);

  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");

  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
