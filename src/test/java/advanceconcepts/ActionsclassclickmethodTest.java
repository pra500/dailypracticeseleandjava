package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class ActionsclassclickmethodTest {
	
	WebDriver driver;	
	
  @Test(priority = 0)
  public void clickTest() {
	  
	  
              WebElement wb=driver.findElement(By.xpath("//a[normalize-space()='Practice']"));			  
			  Actions act=new Actions(driver);
			  act.moveToElement(wb).click().perform();				  
			  
			  
	    
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
