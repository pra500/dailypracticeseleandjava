package advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Arrlowclass1Test {
	
	WebDriver driver;
	
  @Test
  public void selectTest() {
	  
	  
	  
	  //press f11
	  WebElement wb= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	  
	 	
	 Actions act=new Actions(driver);
	  act.click(wb).build().perform();
	  
	  act.sendKeys(Keys.ARROW_DOWN).build().perform();
	 act.sendKeys(Keys.ARROW_DOWN).build().perform();
	  act.sendKeys(Keys.ARROW_UP).build().perform();
	  
	  
	  
  }
  
  
  //calendar
	
  @Test
  public void calendarTest() {
	  
	  
  }
  
  
  
  

  @BeforeClass
  public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
