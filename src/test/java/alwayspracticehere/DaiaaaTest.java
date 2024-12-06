package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DaiaaaTest {
	
	
	 WebDriver driver;
	
  @Test
  public void Test() {
	  
	  System.out.println( driver.getCurrentUrl());
	  
	  
	  //driver.getCurrentUrl()
	  
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {  
	
	    driver=new ChromeDriver();	  
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
