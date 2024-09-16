package advanceconcepts;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;



public class listfindelementsforeachTest {
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {  
	  
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(200, 240)", "");
	  
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class='LnLd_R']"));
	
	for(WebElement b:list)
	{
		//if(b.getText().equalsIgnoreCase("Selenium"))
		{
		System.out.println(b.getText());
			
			
			//b.click();
			//break;
		}
	}
	  
  }
  
  @Test
  public void fdkkTest() {  
	  
	 String s= driver.findElement(By.xpath("//a[text()='Selenium']")).getText();
	  System.out.println(s);
	  
  }
  
  
  @Test
  public void fdkkuTest() {    
	  	  
	 	  
	  List<WebElement>list=driver.findElements(By.xpath("//select[@id='country']"));
	  
	  System.out.println(list.size());
	  
	  for(WebElement wb:list)
	  {
		  System.out.println(wb.getText());
	  }
	  

	  
  }
  
  
  
    
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.get("https://www.numpyninja.com/post/guide-to-handle-pagination-in-selenium");
	  
		 driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  driver.close();
  }

}
