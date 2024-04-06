package parallelexecutionandcrossbrowsertesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTest {
	
	
	
	
	//plz refer "testngforcrossbrowser.xml" for execution

	WebDriver driver;
	
	
	
	
	
 	
  @BeforeClass
  @Parameters("browser")
  public void setup(String bro1) {
	
	if(bro1.equalsIgnoreCase("chrome"))
	{
		 driver=new ChromeDriver();	  
		
	}
	else if(bro1.equalsIgnoreCase("firefox"))
	{
		 driver=new FirefoxDriver();
	}
	
	else if(bro1.equalsIgnoreCase("edge"))
	{
		 driver=new EdgeDriver();
	}
	else if(bro1.equalsIgnoreCase("safari"))
	{
		driver=new SafariDriver();
	}
	else
	{
		System.out.println("plz gv the correct browser");
	}

	 
	
	        driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://naveenautomationlabs.com/opencart/");
	  
  }
  
  
 @Test
  public void titleTest() {
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title,  "Your Store");	   
	   
}
 
 @Test
 public void URLTest() {
	  
	  String URL=driver.getCurrentUrl();
	  Assert.assertEquals(URL,  "https://naveenautomationlabs.com/opencart/");	   
	   
}
  

  @AfterClass
  public void afterClass() {
	  
	  driver.close();  
	}

}


