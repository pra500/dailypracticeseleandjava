package pac2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {	
	 
  @BeforeSuite
  public void beforeSuite() {
	  
	  WebDriver driver;
  }
  
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  
	 String path="C:\\Users\\Admin\\eclipse-workspace\\dailypracticeseleandjava\\src\\test\\java\\pac2\\configeee.properties";
	 FileInputStream fip=new FileInputStream(path);	 
	  Properties prop=new Properties();
	  prop.load(fip);	  
	String url=  prop.getProperty("url");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 
  }
  
  
  
	
  @Test(priority = 0)
  public void searchTest() {
  }
  
  
  
	
  @Test(priority = 1)
  public void titleTest() {
  }
  
  

  @BeforeClass
  public void beforeClass() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @AfterClass
  public void afterClass() {
  }

 

  @AfterTest
  public void afterTest() {
  }

  

  @AfterSuite
  public void afterSuite() {
  }

}
