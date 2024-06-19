package interview6june;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinksgetonelink {
	//need to chk again
	
	public static WebDriver driver;
	
	
	public static void alllinks()
	{
		
		
		
		List<WebElement>list=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<=list.size()-1;i++)
		{
			
			String str=list.get(i).getText();
			if(str.equals("Get Started Free"));
			System.out.println(list.get(i).getText());
			break;
		}
		
				
		
	}
	
	
		

	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.lambdatest.com/blog/find-broken-images-using-selenium-webdriver/");	
		alllinks();
		//driver.close();

	}
	
	

}
