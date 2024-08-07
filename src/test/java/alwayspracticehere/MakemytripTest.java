package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class MakemytripTest {
	
	
	 WebDriver driver;
	 
  @Test
  public void getTest() {
	  
	 String title= driver.getTitle();
	  
	  Assert.assertEquals(title , "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	   
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");	
		
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
