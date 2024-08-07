package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class alllinksTest {
	
	
  @Test
  public void fTest() {	  
	  
	 
	  
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
	
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
