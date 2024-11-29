package alwayspracticehere;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SBITest {
	
	WebDriver driver;
	
  @Test
  public void getTest() {
	  
	  List<WebElement> list=
	  
	driver.findElements(By.tagName("input"));
	  
	  System.out.println(list.size());  
	  
	  
	  
  }
  
  
  
	
  @Test
  public void getnnTest() {
	  
	  List<WebElement> list=
	  
	driver.findElements(By.tagName("button"));
	  
	  System.out.println(list.size());  
	  
	  
	  
  }
  
  
	
 
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
	driver.get("https://www.onlinesbi.sbi/");
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
}
