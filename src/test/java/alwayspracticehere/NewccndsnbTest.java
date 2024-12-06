package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewccndsnbTest {
	
	
	WebDriver driver;
  @Test
  public void fTest() {
	  System.out.println( driver.getTitle());
	  
	 // driver.getTitle()
	  
  }
	
  

  @BeforeClass
  public void beforeClass() {  
	  
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("incognito");
	    driver=new ChromeDriver(co);	  
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
