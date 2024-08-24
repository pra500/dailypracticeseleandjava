package l;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void getTest() {
	  
	  System.out.println(driver.getTitle());
	  
	  //driver.getTitle()
  }
  
  
	
  @Test
  public void gewtTest() {
	  
	  System.out.println(driver.getTitle());
	  
	  //driver.getTitle()
  }
  
  
	
  @Test
  public void gewwtTest() {
	  
	  System.out.println(driver.getTitle());
	  
	  //driver.getTitle()
  }
	
  @Test
  public void gewwwtTest() {
	  
	  System.out.println(driver.getTitle());
	  
	  //driver.getTitle()
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));				
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
