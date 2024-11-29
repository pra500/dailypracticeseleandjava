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



public class BTest {
	
	WebDriver driver;
	

	@Test
	  public void fooooTest() {
		 
		
		List<WebElement> list=
		
		driver.findElements(By.cssSelector("a.hfe-menu-item"));
		
		
		System.out.println(list.size());
		

		
for(int i=0;i<=list.size()-1;i++)
{
	
	
	System.out.println(list.get(i).getText());
	
	//list.get(i).getText();)
}
		
		  
	  }
	  
	

	@Test
	  public void foTest() {
		  
		
		  
	  }
	  
	

	@Test
	  public void fdffvfdvmTest() {
		  
		
		  
	  }
	  
	
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }	
  
  
  
  
 
}
