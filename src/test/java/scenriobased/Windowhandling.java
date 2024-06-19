package scenriobased;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Windowhandling {

	@Test
	public void gTest() {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement wb=driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", wb);
				
		
		
		//driver.findElement(By.xpath("//button[@id='windowButton']")).click();

		Set<String> set1 = driver.getWindowHandles();

		Iterator<String> itr = set1.iterator();

		String par = itr.next();

		String chi = itr.next();

		driver.switchTo().window(chi);

		boolean flag = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).isDisplayed();

		Assert.assertTrue(flag);

		driver.close();

		driver.switchTo().window(par);

		boolean flag1 = driver.findElement(By.xpath("//div[text()='Forms']")).isDisplayed();

		Assert.assertTrue(flag1);

		driver.quit();

	}

}
