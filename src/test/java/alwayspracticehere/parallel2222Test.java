package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class parallel2222Test {
	
	
	
	
	WebDriver driver;
	
	
  @Test
  public void sTest()
  {
	  
	  
	 System.out.println(driver.getTitle());
	  
	  
	  
	  
  }
 
  @BeforeClass
  @Parameters("browser")
  public void setup(String s) {
	  
	  if(s.equalsIgnoreCase("chrome"))
		   driver=new ChromeDriver();	  
	  else 
		  driver=new FirefoxDriver();
	  
	  
	        driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://practicetestautomation.com/practice-test-login/");
	  
		  
  }
 
 

}
