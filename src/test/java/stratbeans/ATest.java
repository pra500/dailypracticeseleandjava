package stratbeans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ATest {
	// title
	
	
	//url
	
	
	//broken links
	
	//broken images
	
	//incognito
	
		
	
	//span[@class='hustle-icon-close']
	
	WebDriver driver;
	
	
  @Test
  public void titleTest() {
	  
	  
	  String title=   driver.getTitle();
	  Assert.assertEquals(title,  "Stratbeans - AI Enabled LXP, Upskilling and LMS");
			 
	
	  
  }
  
  
  
  
  
	
  @Test
  public void urlTest() {
	String url=  
	  driver.getCurrentUrl();
	
	Assert.assertEquals(url,  "https://stratbeans.com/");
	
	 
  }
  
  
  
  
  
	
 
  
  
  
  
  
  
  
  

	
  @Test
  public void brokenimagesTest() {
  }
  
  
  
  
  

  @Test
  public void clickonbookademoTest() {
	  
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://stratbeans.com/");
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
