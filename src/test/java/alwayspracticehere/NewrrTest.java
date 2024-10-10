package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class NewrrTest {
	
	
	WebDriver driver;
	

  
	
@Test(description = "title")
public void ftTest() {

	  System.out.println(driver.getTitle());

}


@Test
public void fddTest() {

  System.out.println(driver.getWindowHandle());
  
  
  

}


@Test
public void fddrTest() {

 
  
  throw new SkipException("skipping");
  

}




  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
