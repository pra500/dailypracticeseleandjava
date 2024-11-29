package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class SqTest {
	
	
	WebDriver driver;
	
	
	
  @Test(priority = 0)
  public void fTest() {
	  	  
	  
	  //select class all methods:
	  
      WebElement wb=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
	  
	Select sel=new Select(wb);
	
	sel.selectByVisibleText("Angola");  
	
	sel.selectByIndex(4);   //American Samoa
	
	sel.selectByValue("ALB");	  //Albania
	
	boolean b=sel.isMultiple();
	
	System.out.println(b);
	
	
	List<WebElement>list=sel.getOptions();
	
int t=list.size();

for(int i=0;i<=t-1;i++)
{
	
	System.out.println(list.get(i).getText());
	
	
}


     WebElement wb1=sel.getFirstSelectedOption();
	  
	  System.out.println(wb1);
	  
	  	  
	
	  
  }
  
  
  
  
  //soliuitions, learning mgt system, assert the title
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  
	  driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
