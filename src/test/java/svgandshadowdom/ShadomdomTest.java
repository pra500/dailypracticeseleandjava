package svgandshadowdom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShadomdomTest {
	
	
	WebDriver driver;
	
  @Test
  public void getTest() {
	   
	  
	       JavascriptExecutor js=(JavascriptExecutor)driver;
           WebElement wb=(WebElement)js.executeScript("return document.querySelector(\"html > grammarly-desktop-integration\").shadowRoot.querySelector(\"div\")");
			boolean b= wb.isDisplayed();			
			Assert.assertTrue(b);			
				
			
			
			
			
			
			//document.querySelector("html > grammarly-desktop-integration").shadowRoot.querySelector("div")
			//<div aria-label=​"grammarly-integration" role=​"group" tabindex=​"-1" class=​"grammarly-desktop-integration" data-content=​"{"mode":​"full","isActive":​true,"isUserDisabled":​false}​">​::before​</div>​
  }
 
  
  
  
  @BeforeClass
  public void beforeClass() {	  	  

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
