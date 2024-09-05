package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LinksTest {
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
	 
	List<WebElement>list=  driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	
	
	 

	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
  }
  
  

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
