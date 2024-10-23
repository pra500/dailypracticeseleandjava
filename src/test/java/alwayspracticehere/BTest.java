package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;



public class BTest {
	
	WebDriver driver;
	

	@Test
	  public void fTest() {
		  
		
		  
	  }
	  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }
  
  
  
  
 
}
