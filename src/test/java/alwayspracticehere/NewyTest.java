package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewyTest {
	
	WebDriver driver;
	
	
  @Test
  public void ftest() {
	  
	  SoftAssert sa=new SoftAssert();
	  
	String title=  driver.getTitle();
	Assert.assertEquals(title,"Practice Page");
	
	
	Assert.assertTrue(false);
	
	
	Assert.assertFalse(true);
	  
	  sa.assertAll();
	  
	//Assert.assertEquals("Assert.assertEquals(title,\"Practice Page\");","Practice Page");
	  
	  
	  String url=driver.getCurrentUrl();
	 
	  
	  
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();	  
	   driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
