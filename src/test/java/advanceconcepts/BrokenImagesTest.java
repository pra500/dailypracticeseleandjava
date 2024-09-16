package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BrokenImagesTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	// Finding all the available links on webpage
	  List<WebElement> links = driver.findElements(By.tagName("img"));


	  // Iterating each link and checking the response status
	  for (WebElement link : links) {
	  String url = link.getAttribute("src");
	  verifyLink(url);
	  }	  
	  
  }
  
 
  
  public static void verifyLink(String url) {
	  try {
	  URL link = new URL(url);
	  HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
	  httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
	  httpURLConnection.connect();


	  if (httpURLConnection.getResponseCode() == 200) {
	  System.out.println(url + " - " + httpURLConnection.getResponseMessage());
	  } else {
	  System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken image");
	  }
	  } catch (Exception e) {
	  System.out.println(url + " - " + "is a broken image");
	  }
	  }
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {	  

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
