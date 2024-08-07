package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class shadowdomTest {
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	  WebElement wb=(WebElement) js.executeScript("return document.querySelector(\"html > grammarly-desktop-integration\").shadowRoot.querySelector(\"div\")\""); 
	  
	js.executeScript("arguments[0].click();", wb);
	 
	 

  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
driver=new ChromeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();  
	  }
}
