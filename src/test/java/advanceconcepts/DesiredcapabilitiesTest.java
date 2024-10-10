package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class DesiredcapabilitiesTest {
	
	
	//DesiredCapabilities :  just for interview 
	
	WebDriver driver;
	
	
	
	
	
		
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getTitle());
	  
	  
  }
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  		/*	
	  
	DesiredCapabilities d=new DesiredCapabilities();
	d.setCapability("browsername", "chrome");
	d.setCapability("version", "120");
	d.setCapability("platform", "windows");
	
	
	
	  driver=new ChromeDriver(d);		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);			
		driver.get("https://naveenautomationlabs.com/opencart/");
		*/	
	
		  
  }

  @AfterClass
  public void afterClass() {
  }

}
