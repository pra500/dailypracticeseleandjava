package advanceconcepts;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;

public class FluentwaitTest {
	
	 WebDriver driver;
	
  @Test
  public void fTest() { 
	  
	  
	  
	
	Wait<WebDriver> fl = new FluentWait<WebDriver>(driver)
	        .withTimeout(Duration.ofSeconds(30))
	        .pollingEvery(Duration.ofSeconds(5))
	       .ignoring(NoSuchElementException.class);

		
	
	
	fl.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-search']"))).click();	
	
		
  }
  @BeforeClass
  public void beforeClass() {

	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
