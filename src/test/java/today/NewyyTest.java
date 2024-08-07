package today;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewyyTest {
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  

      driver=new EdgeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		String ss=driver.getWindowHandle();
		System.out.println(ss);
		
  }
  
  @Test(dependsOnMethods = "fTest")
  public void fiTest() {
	  
	  

      driver=new EdgeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
  }
  

  @Test(dependsOnMethods = "fiTest")
  public void fiiTest() {
	  
	  

      driver=new EdgeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
	
  }
  
}
