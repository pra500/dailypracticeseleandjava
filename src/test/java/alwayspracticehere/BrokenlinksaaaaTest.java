package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;




public class BrokenlinksaaaaTest {
	
	WebDriver driver;
	
	
  @Test
  public void brokenlinksTest() throws IOException {
	  
	List<WebElement>list=driver.findElements(By.tagName("a"));	
    System.out.println(list.size());
    
    for(int i=0;i<=list.size()-1;i++)
    {
    	WebElement wb=list.get(i);
    	String s=wb.getAttribute("href");
    	broke(s);
    	
    	
    }
	  
	  
  }
  
  
  public void broke(String url) throws IOException
  {
	  
	  URL uu=new URL(url);
	  HttpURLConnection h=(HttpURLConnection)uu.openConnection();
	  h.setConnectTimeout(3000);
	  h.connect();
	  int responsecode=h.getResponseCode();
	  
	  if(h.getResponseCode()==200)
      {
          System.out.println(url+" - "+h.getResponseMessage());
       }
	  else   
      {
          System.out.println(url+" - "+h.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
       }   
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
