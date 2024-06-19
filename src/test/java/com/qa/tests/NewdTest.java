package com.qa.tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class NewdTest {
	
	

	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  boolean b=driver.findElement(By.xpath("//*[name()='svg' and @id='tnb-google-search-icon']")).isDisplayed();
	  System.out.println(b);
	  
	  
	  
	  String st=driver.findElement(By.xpath("(//*[name()='svg' and @fill='none'])[3]")).getAttribute("aria-hidden");
	  
	boolean b3=Boolean.parseBoolean(st);
	Assert.assertEquals(true, b3);
	
	
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/graphics/svg_intro.asp");
  }
  
  @AfterClass
  public void s()
  {
	  driver.close();
	  
  }
  

}
