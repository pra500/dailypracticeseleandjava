package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewffdsTest {
	
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
  
	WebElement wb=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	
	Select sel=new Select(wb);
	
	sel.selectByVisibleText("Option2");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  }


}
