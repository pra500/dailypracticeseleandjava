package com.qa.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NsdscTest {
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  String title= driver.getTitle();
	  
	  System.out.println(title);
	  
	  
	String url=  driver.getCurrentUrl();
	  
	 System.out.println(url);
	  
  }
  
  

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("https://www.makemytrip.com/");
	}

	@AfterMethod
	public void teardown() {

		driver.close();

	}

}
