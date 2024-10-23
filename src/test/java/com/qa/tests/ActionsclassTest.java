package com.qa.tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ActionsclassTest {
	
	WebDriver driver;
	
	@Step("title")
	@Description("getting the title")
  @Test
  public void fTest() {
		
		System.out.println();
		driver.getPageSource();
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
