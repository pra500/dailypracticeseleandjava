package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Dytable1111Test {
	
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	 boolean b= driver.findElement(By.xpath("//table[@id='countries']")).isDisplayed();
	  
	System.out.println(b);
	
	List<WebElement>list= driver.findElements(By.xpath("//table[@id='countries']//tbody//tr//td[2]"));
	System.out.println(list.size());
	
	
	
	List<WebElement>list1= driver.findElements(By.xpath("//table[@id='countries']//tbody//tr[1]"));
	System.out.println(list.size());
	
  }
  @BeforeClass
  public void beforeClass() {

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	  	
		
		
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
