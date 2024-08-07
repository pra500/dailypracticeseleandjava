package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DynamictablexpathTest {
	
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	 // String s=driver.findElement(By.xpath("//table[@id='customers']//tr[3]//td[2]")).getText();
	 // System.out.println(s);
	  
	  
	  
	//table[@id='customers']//tr[5]//td
	  
	  
	List<WebElement>list=  driver.findElements(By.xpath("//table[@id='customers']//tr[5]//td"));
	
	System.out.println(list.size());
	  
	for(WebElement w:list)
	{	
		System.out.println(w.getText());
		
		
	}
	
	
	
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  
  
//  3
//  Island Trading
//  Helen Bennett
//  UK
  
  
  

}
