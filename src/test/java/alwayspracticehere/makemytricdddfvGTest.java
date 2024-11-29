package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class makemytricdddfvGTest {
	
	WebDriver driver;	
	
  @Test
  public void fTest() {
  
  JavascriptExecutor js=(JavascriptExecutor) driver;
  js.executeScript("arguments[0].value=''");
  
	  	
  
//input[@id='username']
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
}
