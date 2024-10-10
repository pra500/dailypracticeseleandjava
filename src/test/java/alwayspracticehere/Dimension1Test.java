package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Dimension1Test {
	
	
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getCurrentUrl().contains("glo"));
	  //driver.getCurrentUrl().contains("glo");
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();	
	  
	  Dimension d=new Dimension(300, 700);
	  
	     
	    driver.manage().window().setSize(d);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
	    driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
  }

  @AfterClass
  public void afterClass() {
  }

}
