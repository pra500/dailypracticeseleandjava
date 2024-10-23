package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RahulshettyTest {
	
 
	WebDriver driver;
	
	@Parameters({"browser", "browserversion", "testname"})
@Test
  public void fTest() {
	  
	  //driver.get("https://rahulshettyacademy.com/AutomationPractice/")
	
	  driver.findElements(By.xpath("(//table[@id='product'])[1]//tr"));
	  
  }
  
	


  @Test
  public void fjTest() {
  }
  
  
	
  @Test
  public void fkkTest() {
  }
  
  
	
  @Test
  public void flllTest() {
  }
  

  @BeforeClass
  public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
}
