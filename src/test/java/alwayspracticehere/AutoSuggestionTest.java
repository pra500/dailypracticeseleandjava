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

public class AutoSuggestionTest {
	
		WebDriver driver;
		
	/*	
		
		
	/*
  @Test
  public void fTest() {
	  
	List<WebElement>list=driver.findElements(By.xpath("//textarea[@name='q']"));
		
	
	for(int i=0;i<=list.size()-1;i++)
	{
		if(list.get(i).getText().equalsIgnoreCase("autosuggestion meaning"))
		{
			
			list.get(i).click();
			break;
			
		}
	}
	*/
	
	
	
	
	/*
	@Test
	  public void fTest() {
		 	
		
		
	List<WebElement>list=driver.findElements(By.tagName("img"));
	
	for(int i=0;i<=list.size()-1;i++)
	{
		
		
	WebElement wb =	list.get(i);
	String b=wb.getAttribute("src");
	
	broken(b);
	}
	
	
	
	
	
	}
	public static void  broken(String url)
	{
		
		
		
	}
	
	*/
		
		
		
	@Test
	public void pickdateTest()
	{	
				
		
		
		
		driver.findElement(By.xpath("(//div[@class='DayPicker-Body'])[2]")).click();
		
		
		
	}
	
	
	
	
	
		
	 
	  
	  
  
  @BeforeClass
  public void beforeClass() {
	  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.get("https://www.google.com");
		
		
		driver.get("https://www.makemytrip.com/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
