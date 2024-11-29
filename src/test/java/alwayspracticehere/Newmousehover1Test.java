package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Newmousehover1Test {
	
	
	//need to chk testngeasy.xml grouping execution, not working fine
	
	
	 WebDriver driver;
	
	
  @Test(priority = 0, groups= {"sanity"})
  public void fTest() throws AWTException {
	  
	  
	  
	  
	  Robot rb=new Robot();	
	  rb.keyPress(KeyEvent.VK_TAB);	  
	  
  }  
  
  
  @Test(priority = 1, groups= {"smoke"})
  public void flTest() throws AWTException {
	  
	  
	  
	  Robot rb=new Robot();
	  rb.keyPress(KeyEvent.VK_SHIFT);
	  
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
