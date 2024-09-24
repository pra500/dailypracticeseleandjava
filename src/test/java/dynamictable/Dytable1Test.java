package dynamictable;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Dytable1Test {
	
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	 String s= driver.findElement(By.xpath("//table[@id='customers']//tbody//tr//td//span[text()='Google']")).getText();
	  System.out.println(s);
	  
	  
	  List<WebElement>list= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td//span"));	  
	  System.out.println(list.size());
  
	 
	  
	  List<WebElement>list1= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td[3]"));
	  System.out.println(list1.size());
	  
	  
	  List<WebElement>list3= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[2]"));
	  for(WebElement w:list3)
	  {
		  
		  System.out.println(w.getText());		 
		  
	  }
	   	  
	  
	  
	  
	  List<WebElement>list4= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[3]"));
	  for(WebElement w:list4)
	  {
		  
		  System.out.println(w.getText());		 
		  
	  } 
	  
	  
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {

	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	  	
		
				
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
