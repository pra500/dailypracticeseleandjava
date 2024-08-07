package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class SelectTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  WebElement wb=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	
	  
	  Select sel=new Select(wb);
	  
	  WebElement wb1=sel.getFirstSelectedOption();
	  System.out.println(wb1.getText());
	  	
	  
  }
  
  @Test
  public void fkTest() {
	
	  
	  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
	
	  
	  WebElement wb=driver.findElement(By.xpath("//select[@name='category_id']"));
	
	  
	  Select sel=new Select(wb);
	  
	  WebElement wb1=sel.getFirstSelectedOption();
	  System.out.println(wb1.getText());
	  	
	  
  }
  
 
 
 
 
  @BeforeClass
  public void beforeClass() {

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
