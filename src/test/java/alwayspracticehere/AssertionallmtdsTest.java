package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionallmtdsTest {
	
	
	WebDriver driver;
	
  @Test
  public void fiuTest() {  	 
	  
	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();		
		driver.navigate().to("chrome://downloads/");
		
		
		WebElement wb=
		driver.findElement(By.cssSelector("downloads-manager"));
	
		
		SearchContext wb1= wb.getShadowRoot();
		
		
	String s1=wb1.findElement(By.cssSelector("iron-list")).getText();
	
	
	  System.out.println(s1);
	  
	  	
	  
  }
  
  
  
 
  
	
  @Test
  public void fiTest() {
	  
	  
	  driver.get("https://www.yatra.com/");
	  
  }
  
	
  @Test
  public void fkkTest() {
  }
  
  
}
