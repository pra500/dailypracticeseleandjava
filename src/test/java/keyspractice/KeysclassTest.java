package keyspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeysclassTest {
	
	 WebDriver driver;		
	 
  @Test
  public void uTest() {
	  System.out.println(driver.getCurrentUrl());
	  
	  //driver.getCurrentUrl()
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
