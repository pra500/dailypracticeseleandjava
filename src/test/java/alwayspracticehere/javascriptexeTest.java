package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class javascriptexeTest {
	
	
	WebDriver driver;
	
	
	
	  @Test
	  public void fiiTest() {
		
	
		   JavascriptExecutor js=(JavascriptExecutor)driver;		
		   WebElement wb=driver.findElement(By.id("submit"));
		   js.executeScript("arguments[0].click();", wb);
		   
		   
		
	}
    
  @Test
  public void fiTest() {
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;	  
	   js.executeScript("window.scrollBy(120,134)", ""); 
	   
	  //JavascriptExecutor js1=(JavascriptExecutor)driver;
	   js.executeScript("document.getElementById('username').value='student'");
	   
	   
	  // JavascriptExecutor js5=(JavascriptExecutor)driver;
	   js.executeScript("document.getElementsByName('password').value='student@123");
	   
	   
	   //JavascriptExecutor js2=(JavascriptExecutor)driver;
	   js.executeScript("document.getElementsByClassName('menu-primary-items').checked=false;");
	   
	   //JavascriptExecutor js3=(JavascriptExecutor)driver;
	   js.executeScript("document.getElementsByTagName('img').click();");
	   
	   
	   
	 
	  
  }
	  
  
  
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
