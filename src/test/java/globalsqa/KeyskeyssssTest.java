package globalsqa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class KeyskeyssssTest {
	
	
	WebDriver driver;
	
  @Test
  public void fjTest() {
	  
	  
	  
	 String title= driver.getTitle();
	 
	 Assert.assertEquals(title,  "Practice Page");
  }

  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice//");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
