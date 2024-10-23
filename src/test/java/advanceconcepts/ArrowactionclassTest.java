package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class ArrowactionclassTest {
	
	
	WebDriver driver;
	
  @Test(enabled=false)
  public void fTest() {  
	  
	  Actions actions=new Actions(driver);
	  	  
	  WebElement wb= driver.findElement(By.xpath("//select"));
	   
	  actions.click(wb).build().perform();
	  actions.sendKeys(Keys.ARROW_DOWN).build().perform();   // Moves down in a dropdown menu
	  actions.sendKeys(Keys.ARROW_UP).build().perform();     // Moves up in a dropdown menu
	  
	  //keys.arr
	  
  }
  
  
  @Test
  public void fuTest() {  
	  
	
	  
	  
	  
	  
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
