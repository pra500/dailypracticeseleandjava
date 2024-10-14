package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ScrollintoviewTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  System.out.println(driver.getClass());
	  
	  
	  System.out.println(driver.getTitle());
	  
	  System.out.println(driver.getCurrentUrl());
	  
	 
	  
	  
	  
  }
  
  
	
  @Test
  public void foiTest() {
	  
	  
	 List<WebElement> list=driver.findElements(By.tagName("a"));
	 System.out.println(list.size());
	
	 
	
	  
	  
	  
  }
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	
	  driver.close();
	  
  }

}
