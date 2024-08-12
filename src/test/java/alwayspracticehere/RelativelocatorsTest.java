package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RelativelocatorsTest {
	
	

	WebDriver driver;
	
  @Test
  public void get1Test() {
	  
	 WebElement wb=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	  	
	 Select sel=new Select(wb);
	 
	 sel.selectByVisibleText("Option2");
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
