package stratbeans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StratbeansTest {
	
	
	WebDriver driver;
  @Test
  public void fTest() {	  
	  
	  String title= driver.getTitle();
	  System.out.println(title);
	  
	  
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://stratbeans.com/");
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
