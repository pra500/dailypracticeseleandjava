package scenriobased;

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

public class BrowserstackTest {
	
	//scenario:	
	//https://www.browserstack.com/guide/javascriptexecutor-in-selenium
    //developers
	//test uni
	//search
	//java enter
	
	
	 WebDriver driver;
	
	
	
  @Test
  public void searchTest() {
	  
	  
	 WebElement wb= driver.findElement(By.id("developers-dd-toggle"));	 
	 Actions act=new Actions(driver);
	 act.moveToElement(wb).build().perform();
	 
	 
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	 
	 driver.findElement(By.xpath("//a[@title='Test University Beta']")).click();
	 
	 
	 
	 driver.findElement(By.xpath("(//button[@aria-label='Search'])[2]")).click();
	 driver.findElement(By.xpath("//input[@id='doc-search-box-input']")).sendKeys("java", Keys.ENTER);
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/guide/javascriptexecutor-in-selenium");

  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
