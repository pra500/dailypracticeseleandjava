package alwayspracticehere;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class NeeeeeTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  System.out.println( driver.getTitle());
			  
	   
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	  
  }

}
