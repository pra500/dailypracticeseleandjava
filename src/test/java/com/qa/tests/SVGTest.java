package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SVGTest {
	
	
	//naveen: https://www.youtube.com/watch?v=tm5ia_ydAjs&ab_channel=NaveenAutomationLabs
	
	
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	 
	  
	  
	  
	  
	  String fill=driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Write']")).getAttribute("fill");
	  System.out.println(fill);
	  
/*
	 String s= driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Notifications']")).getAttribute("height");
	  int h=Integer.parseInt(s);
	  System.out.println(h);
	  
	  
	  (//*[name()='svg']//*[local-name()='path' and @stroke='currentColor'])[1]
	*/  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://medium.com/illumination/automating-svg-elements-with-selenium-a7c31f99ebf8");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
