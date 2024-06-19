package groupingexe;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
		
	
	
	
	WebDriver driver;
	
	
	
	
  @Test(priority = 0, groups = {"smoke"})
  public void fTest() {
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Your Store");
	  
	  
	  
  }
  
  @Test(priority = 1, groups = {"sanity"})
  public void fuTest() {
	  
	  String url=driver.getCurrentUrl();
	  Assert.assertEquals(url, "https://naveenautomationlabs.com/opencart/");
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();		
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
