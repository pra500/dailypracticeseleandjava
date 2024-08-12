package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewddTest {
	
	WebDriver driver;
  @Test(priority = 0)
  public void getTest() {
	
	  
	 String title= driver.getTitle();
	 
	 Assert.assertEquals(title,  "Your Store");
	  
  }
  
  
  @Test(priority = 1)
  public void gehtTest() {
	
	  
	 String title= driver.getTitle();
	 
	 Assert.assertEquals(title,  "Your Store");
	  
  }
  
  @Test(invocationCount = 2)
  public void getkTest() {
	
	  	
	 String title= driver.getTitle();
	 
	 Assert.assertEquals(title,  "Your Store");
	  
  }
  
  

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
