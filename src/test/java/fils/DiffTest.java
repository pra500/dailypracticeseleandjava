package fils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;

public class DiffTest {
	
	
	
	 WebDriver driver;
	 
	 
  @Test
  public void fTest() throws FileNotFoundException {
	 
	  
	  String filepath="C:\\Users\\Admin\\eclipse-workspace\\dailypracticeseleandjava\\src\\test\\java\\fils\\config.properties";
	  
	  FileInputStream fip=new FileInputStream(filepath);
	  
	  Properties prop=new Properties();
	  String browser=prop.getProperty("browser");
	  String url=prop.getProperty("url");
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  else if(browser.equalsIgnoreCase("safari"))
	  {
		  driver=new SafariDriver();		  
	  }
	  else
	  {
		  System.out.println("please provide correct browser");
	  }
	  
	        driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://practicetestautomation.com/practice-test-login/");
			

			
			
	
			
			  
  }
  
  
 
  
  
  

}
