package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YettTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  
	 
	boolean b=  
	  driver.findElement(By.xpath("//span[normalize-space()='Bus']")).isDisplayed();
	  
	  System.out.println(b);
  }
  
  
  @BeforeClass
  public void beforeClass() {
  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
