package overridingusgaeinurframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NerrTest {
	
	
	 WebDriver driver;		
	 
	
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getClass());
	 // driver.getClass()
  }
  
  
  @Test
  public void fjjTest() {
	  
	  System.out.println(driver.getTitle());
	 // driver.getClass()
	  
	  
  }
  
  @Test
  public void fjhjTest() {
	  
	  System.out.println(driver.getWindowHandle());

	  
  }
  

  @Test
  public void fjjiTest() {
	  
	  System.out.println(driver.getPageSource().contains("src"));
	 // driver.getClass()
	  
	  
  }
  

  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/login");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
