package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.*;





public class Makemytrip222Test {
	
	 WebDriver driver;
	 
	
	
  @Test(priority = 0)
  public void fTest() {
	  
	  
	
	  
	
	  System.out.println(driver.getTitle());
	  
	  
  }
  
  
	
  @Test(priority = 1)
  public void fooTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	
	  
	  
	  
	  
  }
  
  
	
  @Test(priority = 2)
  public void fuuuTest() {
	  
	  boolean b=driver.findElement(By.xpath("//img[@alt='Make My Trip']")).isDisplayed();
	  
	  Assert.assertTrue(b);
	 
	  
  }
  
  
	
  @Test(priority = 3)
  public void fiTest() {
	  
	  System.out.println(driver.getWindowHandle());
	
	  
  }
  
  
	
  @Test(priority = 4)
  public void fi3Test() {
	  
	  
	  List<WebElement>list=driver.findElements(By.xpath("//input"));
	  System.out.println(list.size());
	
	  
  }
  
  
	
  @Test(priority = 5)
  public void fiuTest() {
	  
	  
	  List<WebElement>list=driver.findElements(By.tagName("input"));
	  System.out.println(list.size());
	  
  }
  
  
 
  
  @BeforeClass
  public void beforeClass() {  
	  
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("incognito");
	    driver=new ChromeDriver(co);	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");	
		
  }

  @AfterClass 
  public void afterClass() {
	  driver.close();

  }

 

}
