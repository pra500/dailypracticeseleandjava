package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class javascript1Test {
	
	//ll chk later
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("document.getElementById('openwindow').click();");	  
  }
  
	
  @Test
  public void fiTest() {
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("document.getElementsByClassName('btn-style class1 class2').click();");
	  
  }
  
	
  @Test
  public void fiiTest() {
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("document.getElementsBytagName('legend').click();"); 
  }
  @BeforeClass
  public void beforeClass() {
	  
driver=new ChromeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();  }

}
