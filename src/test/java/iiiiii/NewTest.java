package iiiiii;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(Liste3.class)
public class NewTest extends Liste3 {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	 System.out.println(driver.getTitle()); 
	 // driver.getTitle()
  }
  
	
  @Test
  public void fkTest() {
	 System.out.println(driver.getWindowHandle());
	 // driver.getTitle()
  }
  
  
	
  @Test
  public void flTest() {
	 System.out.println(driver.getCurrentUrl());
	 // driver.getTitle()
  }
  
  
  @BeforeMethod
  public void setup()
  {
	  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
	  
	  
  }
  
  @AfterMethod
  public void teardown()
  {
	  driver.close();
	  
	  
  }
}
