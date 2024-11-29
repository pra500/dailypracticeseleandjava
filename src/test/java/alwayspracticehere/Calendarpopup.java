package alwayspracticehere;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarpopup {
			
	
	public static void main(String[] args) {
		
		WebDriver driver;
					

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	
        driver.get("https://example.com/calendar");

        // Desired date
        String targetDate = "15";
        String targetMonth = "March";
        String targetYear = "2023";

        // Create a HashMap for month-to-number mapping
        HashMap<String, Integer> monthMap = new HashMap<>();
        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7);
        monthMap.put("August", 8);
        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);             
        
        

        // Locate calendar elements
        WebElement monthElement = driver.findElement(By.cssSelector(".header .month"));
        WebElement yearElement = driver.findElement(By.cssSelector(".header .year"));
        WebElement nextButton = driver.findElement(By.cssSelector(".header .next"));
        WebElement prevButton = driver.findElement(By.cssSelector(".header .prev"));

        // Navigate to the target month and year
        while (!(monthElement.getText().equals(targetMonth) && yearElement.getText().equals(targetYear))) {
            if (Integer.parseInt(yearElement.getText()) < Integer.parseInt(targetYear)
                || monthMap.get(monthElement.getText()) < monthMap.get(targetMonth)) {
                nextButton.click(); // Move to the next month
            } else {
                prevButton.click(); // Move to the previous month
            }
        }

        // Select the target date
        WebElement targetDay = driver.findElement(By.xpath("//table[@class='days']//td[text()='" + targetDate + "']"));
        targetDay.click();

        // Close the driver
        
        
        
        
        
        driver.quit();
        
        
        
    }
	
}
