	package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class ChromeOptionspracTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  System.out.println(driver.getTitle());
	  
	 
  }
  
  
	
  @Test
  
  public void fnTest() {
	 
	  
	  
	  driver.navigate().to("https://naveenautomationlabs.com/opencart/");
	 
  driver.navigate().refresh();
  
  driver.navigate().back();
  
  driver.navigate().forward();
  
  
  }
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("incognito");  
	  co.addArguments("start-maximized");	  
	  co.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	  
	  
	  
	  driver=new ChromeDriver(co);		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		//driver.get("https://www.numpyninja.com/post/guide-to-handle-pagination-in-selenium");		  
		 driver.get("https://naveenautomationlabs.com/opencart/");
		 
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
