package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Yatrapage {
	

	private WebDriver driver;

	private By departfrom = By.xpath("//p[text()='Departure From']");

	private By goingto = By.xpath("//p[text()='Going To']");

	private By flights = By.xpath("(//span[text()='Flights'])[1]");
	
	
	
	
	public Yatrapage(WebDriver driver)
	{
	this.driver=driver;
	}
	
	
	public void departfromexist()
	{ 
		
		
		driver.findElement(departfrom).isDisplayed();
		
	}
	

	public void   goingonexist()
	{ 
		
		
driver.findElement(goingto).isDisplayed();
		
		
	}

	
	public void  flightsexist()
	{ 
		
		
		
		
	}

}
