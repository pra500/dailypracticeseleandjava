package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerizonTest {
	
	//need to chk
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	 boolean flag= driver.findElement(By.xpath("//button[@id='gnav20-search-icon']")).isDisplayed();
	 Assert.assertTrue(flag);
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.verizon.com/");
  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
