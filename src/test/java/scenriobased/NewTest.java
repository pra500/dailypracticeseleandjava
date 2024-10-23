package scenriobased;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	
	
	WebDriver driver;
	
	
	
  @Test
  public void fiTest() {
	  
	  
	  
	  
	  driver.switchTo().newWindow((WindowType.WINDOW));
	  
	  
	  
	 }
  
	
	
  @Test
  public void fikTest() {
	  
	  
	  
	  
	  
	  
	  driver.switchTo().newWindow((WindowType.WINDOW));
	  
	  
	  
	 }
  
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	    driver=new ChromeDriver();	  
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
