package com.qa.tests;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewyhTest {
	
	
	WebDriver driver;
	
  @Test
  public void sTest() {
	  
	  System.out.println(driver.getClass());
	  //driver.getClass();
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
  public void afterClass() {
	  driver.close();
  }

}
