package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewhhTest {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {  
	  
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  
	 
  }
  
  @Test
  public void flTest() {  
	  
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  
	 
  }
  
  @Test
  public void fmmmTest() {  
	  
	  
	  System.out.println(driver.getCurrentUrl());	  
	  
	 
  }
  
  
  @Test
  public void fkmmm7Test() {  
	  
	  System.out.println(driver.getWindowHandle());
		  
	  
	 
  }
  
  @BeforeClass
  public void beforeClass() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
	
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
