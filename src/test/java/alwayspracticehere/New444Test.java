package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New444Test {
	
	
	WebDriver driver;
  @Test
  public void fTest() {
	  
	 
	  
	   
	  
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://www.globalsqa.com/demo-site/");
			
	String s=driver.getWindowHandle();
		
		System.out.println(s);	
			
		
  }
}
