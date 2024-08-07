package wa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.*;

public class NewyyTest {
	WebDriver driver;
  @Test
  public void fTest() {
	  
	String s=  driver.getTitle();
	  
	System.out.println(s);
  }
  
  
  
  @Test
  public void fjTest() {
	  
	String s=  driver.getCurrentUrl();
	  
	Assert.assertEquals(s, "https://rahulshettyacademy.com/AutomationPractice/");
	}
  
  
  
  
  
  @Test
  public void fjjTest() {

	  
	  
 List<WebElement>list=driver.findElements(By.tagName("input"));
 System.out.println(list.size());
	}
  
  
  

  @BeforeClass
  public void beforeClass() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
