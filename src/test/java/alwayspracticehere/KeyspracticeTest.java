package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeyspracticeTest {
	
	
	 WebDriver driver;		

  
  
  @Test(priority = 1)
  public void fwwTest() {
	  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mac", Keys.ENTER);
	  
	
	  
	  
	 }
  

  
 

  @BeforeClass
  public void beforeClass() {
	  
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
