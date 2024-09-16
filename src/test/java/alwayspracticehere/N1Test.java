package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class N1Test {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
	  String url=driver.getCurrentUrl();
	  
	  Assert.assertEquals(url, "https://rahulshettyacademy.com/AutomationPractice/");
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
