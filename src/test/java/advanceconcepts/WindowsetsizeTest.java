package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class WindowsetsizeTest {
	
	WebDriver driver;
	
	
  @Test(invocationCount = 12)
  public void fTest() {
	  
	  System.out.println( driver.getCurrentUrl());
	  
	
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();
	  
	  Dimension d=new Dimension(300,500);
	  
	  
	 
	  driver.manage().window().setSize(d);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.get("https://toolsqa.com/selenium-webdriver/dropdown-in-selenium/");
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
