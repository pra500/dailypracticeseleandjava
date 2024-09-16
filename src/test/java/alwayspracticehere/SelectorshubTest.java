package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SelectorshubTest {
	
	
	  WebDriver driver;
	  
	  
	  
	
	
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  
  }
  @Test
  public void fuTest() {
	  
	  System.out.println(driver.getTitle());
	 
	  
  }
  @Test
  public void fjjTest() {
	  System.out.println(driver.getWindowHandle());
	 
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
