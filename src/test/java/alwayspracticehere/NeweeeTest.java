package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NeweeeTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getTitle());
	  driver.getTitle();
  }
  
  @Test(dependsOnMethods = {"fTest"})
  public void feTest() {
	  
	  System.out.println(driver.getTitle());
	  driver.getTitle();
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
	  
  }

}
