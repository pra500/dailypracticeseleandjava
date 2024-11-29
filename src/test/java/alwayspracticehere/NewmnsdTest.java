package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewmnsdTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
	  driver=new ChromeDriver();  
	  
		 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			//driver.get("https://toolsqa.com/selenium-webdriver/dropdown-in-selenium/");
			
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		String s=	driver.getTitle();
		
		System.out.println(s);
			
			
		
	}
  
}
