package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TooltipTest {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void getTest() {
	  
	  String exp="Mail";
	  
	String act=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']")).getAttribute("title");
	  System.out.println(act);
	  
	  
	  if(act.equalsIgnoreCase(exp))
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
	  
	  
	
	  
  }

  

  @BeforeClass
  public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/social-icon.html");

  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
