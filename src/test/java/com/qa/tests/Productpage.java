package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {
	
	private WebDriver driver;
	
	
	By search=By.xpath("//input[@id='input-search']");
	
	By allcategories=By.xpath("//select[@name='category_id']");
	
	By searchbtn=By.xpath("//input[@id='button-search']");
	
	By title=By.xpath("//h1[contains(text(), 'Search - laptop')]");
	
	By logo=By.xpath("//img[@alt='naveenopencart']");
	
	
	
	public Productpage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	
	public void searchexist()
	{
		
		driver.findElement(search).isDisplayed();
	}
	
	
	
	public void allcategoriesexist()
	{
		
		driver.findElement(allcategories).isDisplayed();
	}
	
	
	
	public void searchbtnexist()
	{
		
		
		driver.findElement(searchbtn).isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
