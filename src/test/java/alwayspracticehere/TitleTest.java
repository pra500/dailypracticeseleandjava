package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TitleTest {
	
	
  @Test
  public void fTest() {
	  
	  
	  
	  
	  
	  driver.get
	  
  }
  

  @BeforeClass
  public void setup() {
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void teardown() {
	  
	  driver.close();
  }
}
