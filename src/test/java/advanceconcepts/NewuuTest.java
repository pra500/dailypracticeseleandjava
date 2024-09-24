package advanceconcepts;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewuuTest {
	
	
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	//  driver.getCurrentUrl()
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  ChromeOptions co=new ChromeOptions();
	  //co.addArguments("incognito");
	  co.addArguments("start-maximized");
	  co.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	  
	  
	  driver=new ChromeDriver(co);
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
