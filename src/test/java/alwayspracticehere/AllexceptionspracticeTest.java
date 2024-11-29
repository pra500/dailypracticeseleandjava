package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllexceptionspracticeTest {
	
	
	WebDriver driver;
	
	
	//NoSuchElementException	
		//NoAlertPresentException
		//ElementNotVisibleException
		//StaleElementReferenceException
		//TimeoutException
		
		
		//like  dat others also
		
		
		//assert prac
		
	
  @Test
  public void fTest() {
	  
	  
	  
	  
	boolean b=  driver.findElement(By.xpath("//a[normalize-space()='Software1']")).isDisplayed();
	  System.out.println(b );
	  
	 
	  
	  //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//a[normalize-space()='Software1']"}

	  
  }
  
  
  
  
	
  @Test
  public void fuTest() {
	  
	  
	  
	  
  }
  
  
	
  @Test
  public void fuuTest() {
  }
  
	
  @Test
  public void fuuuTest() {
  }
  
  
  
  @BeforeClass
  public void beforeClass() {	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
}
