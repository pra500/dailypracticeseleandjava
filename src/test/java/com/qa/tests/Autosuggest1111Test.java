package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Autosuggest1111Test {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
  }
  
  
  
	
  @Test
  public void fiTest() {
	  //hdfc bank bangalore
	  	  
	  
	  
	  driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("hdfc bank bangalore", Keys.ENTER);
	  
	  driver.findElement(By.xpath("//h3[text()='Nearest Branches & Bank ATMs in Bengaluru, Karnataka']")).click();
	  
	//h3[text()='Nearest Branches & Bank ATMs in Bengaluru, Karnataka']
	  
	 String creditcard=driver.findElement(By.xpath("//div[@class='top-widget']//a[2]")).getText();
	
	  System.out.println(creditcard);
	  
	  
	//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("koramangala");
	  
	//input[@name='search']
	  
	  
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
