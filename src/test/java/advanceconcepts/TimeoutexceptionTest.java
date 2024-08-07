package advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TimeoutexceptionTest {
	// if u want to run a tc within a particular timeframe 
	//it ll take it as in miliseconds , 2000 miliseconds means 2 sec
	
	
	
	
	

	WebDriver driver;
	
  //@Test(timeOut = 1000) //i.e. 1 sec      //pass		
	
  @Test(timeOut = 10)                       //fail  //org.testng.internal.thread.ThreadTimeoutException: Method advanceconcepts.TimeoutexceptionTest.fTest() didn't finish within the time-out 10

  public void fTest() {
	  
	  
	  boolean b=driver.findElement(By.xpath("//a[normalize-space()='Phones & PDAs']")).isDisplayed();
	  System.out.println(b);
  }
  
  
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		
		driver.get("https://naveenautomationlabs.com/opencart/");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
