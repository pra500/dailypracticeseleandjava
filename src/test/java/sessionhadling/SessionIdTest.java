package sessionhadling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Test;

public class SessionIdTest {
	
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  
	  //there will be diff diff session id in case of quit and close
	  //quit ll gv u null , close ll gv u invalid session id
	  	  
	   
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		SessionId se = ((RemoteWebDriver) driver).getSessionId();
	    //System.out.println("Session Id is: " + se);      //Session Id is: 15241edb2a305500d2dc8a645fe72107
	    //driver.quit();
	    
	    
	    System.out.println("Session Id is: " + se);      //Session Id is: a1027f698dd576ae4c43e1f4aafb20f8
	    driver.close();	 
	    
	    	    
	    
  }
}
