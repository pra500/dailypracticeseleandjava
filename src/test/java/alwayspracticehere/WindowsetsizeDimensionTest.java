package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class WindowsetsizeDimensionTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  String title=driver.getTitle();	  
	  System.out.println(title);
	 
	  
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();	
Dimension d=new Dimension(300, 700);
driver.manage().window().setSize(d);
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
