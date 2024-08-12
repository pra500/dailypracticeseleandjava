package kk;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;



@Listeners(Listener44.class)
public class jTest extends Listener44{
	
	
	
	WebDriver driver;	
	
	
  @Test
  public void getTest() {
	  
	  System.err.println( driver.getTitle());
	
	  
  }
  
  @Test
  public void gejtTest() {
	  
	  System.err.println( driver.getTitle());
	
	  
  }
  
  @Test
  public void gektTest() {
	  
	  System.err.println( driver.getCurrentUrl());
	
	  
  }
  @BeforeClass
  public void beforeClass() {
	  

		  
		  
		  driver=new ChromeDriver();	  
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
		
			driver.get("https://www.browserstack.com/guide/relative-locators-in-selenium");
			
			
			
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
		  
	  }
  }


