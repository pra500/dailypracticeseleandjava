package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SubmitfunctionTest {
	
	/*
	//submit();	  - not at all similar to click() btn, both r diff, used only for "forms"
	
https://app.lyssna.com/users/sign_in
https://naveenautomationlabs.com/opencart/index.php?route=account/register

where we find <form> tag, can be "continue"/"sublit"/"Sign in" btn anything in the last, it will work
	*/
	
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  
	  
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("parul88P@gmail.com");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sgh@1234");
	  driver.findElement(By.xpath("//div[@class='css-0']//*[name()='svg']")).click();
	 // driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
	  
  try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
  
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.lyssna.com/users/sign_in");

  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
