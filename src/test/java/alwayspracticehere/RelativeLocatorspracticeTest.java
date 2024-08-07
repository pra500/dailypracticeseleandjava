package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RelativeLocatorspracticeTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
  }
  
  
  

  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
		//for toleftof and torightof:
		//driver.get("https://practicetestautomation.com/practice-test-login/");	
		
		//for near:
		driver.get("https://www.browserstack.com/guide/relative-locators-in-selenium");
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
}
