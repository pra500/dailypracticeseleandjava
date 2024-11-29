package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	 
  }
  
  
  
  @Test
  public void fkTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	 
  }
  
  
  @Test
  public void llfTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	 
  }
  h
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }
}
