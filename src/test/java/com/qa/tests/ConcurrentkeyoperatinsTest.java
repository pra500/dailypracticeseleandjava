package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConcurrentkeyoperatinsTest {
	
	//ctrl+sfift+s
	
	//ctrl+sfift+alt+s
	
	
	
	WebDriver driver;
	
  //@Test
  public void fTest() throws InterruptedException {
	  
Thread.sleep(5000); 
WebElement wb= driver.findElement(By.xpath("//button[@id='submit']"));
	  
	  Actions act = new Actions(driver);
	  
	  
	 // act.sendKeys(wb, Keys.CONTROL, Keys.SHIFT, "s").perform();
	  
	  //act.sendKeys(wb, Keys.CONTROL, Keys.SHIFT, Keys.ALT, "s").perform();
	  

	  //act.sendKeys(wb, Keys.CONTROL, Keys.SHIFT, Keys.ALT, Keys.END, "s").perform();	  
	  
	  
  } 
  
  
  
  
  
  
      
  @Test
  public void sTest()
  {
	
	  driver.findElement(//table//tbody//tr//td[3][contains(text(), '606')])
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
