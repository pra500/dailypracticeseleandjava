package pppppp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Keys122222Test {
	
	

	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  driver.switchTo().newWindow(WindowType.TAB);
  }
  
  
 
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/login");

  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();	  
  }

}
