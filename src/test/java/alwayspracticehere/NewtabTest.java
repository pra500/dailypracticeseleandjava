package alwayspracticehere;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewtabTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
	      driver=new ChromeDriver();
	     driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
	    driver.quit();
	    
	
		
  
  }
  
	
  @Test
  public void kkfTest() {
	  	  

     driver=new ChromeDriver();
   driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	driver.get("https://www.makemytrip.com/");
		
	
	List<WebElement>list=
	driver.findElements(By.xpath("//button"));
	
	
   driver.quit();
   
   
   
   
  }
}
