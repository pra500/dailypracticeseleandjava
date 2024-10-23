package dailyping;

import org.testng.annotations.Test;

import com.qa.tests.AfterClass;
import com.qa.tests.BeforeClass;
import com.qa.tests.ChromeDriver;

public class NewdzvbdvfnmdvTest {
  @Test
  public void fTest() {
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  	  

	    driver=new ChromeDriver();	  
	  
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 
			driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
