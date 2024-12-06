package com.qa.tests;

import org.testng.annotations.Test;

public class ShoppingAppTest {
	
	
	
	    WebDriver driver;

	    // This will run once before all test methods in the suite
	    @BeforeTest
	    public void setup() {
	        System.out.println("Setting up browser and navigating to the application...");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://example-shopping.com");
	    }

	    // This will run before each test method
	    @BeforeMethod
	    public void login() {
	        System.out.println("Logging in before each test case...");
	        WebElement usernameField = driver.findElement(By.id("username"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement loginButton = driver.findElement(By.id("loginButton"));

	        usernameField.sendKeys("testuser");
	        passwordField.sendKeys("password123");
	        loginButton.click();

	        // Verify login success
	        WebElement logoutButton = driver.findElement(By.id("logoutButton"));
	        Assert.assertTrue(logoutButton.isDisplayed(), "Login failed!");
	    }

	    // Test Case 1: Verify product search
	    @Test
	    public void testProductSearch() {
	        System.out.println("Executing testProductSearch...");
	        WebElement searchBox = driver.findElement(By.id("searchBox"));
	        WebElement searchButton = driver.findElement(By.id("searchButton"));

	        searchBox.sendKeys("Laptop");
	        searchButton.click();

	        // Verify search results
	        WebElement product = driver.findElement(By.xpath("//h2[contains(text(), 'Laptop')]"));
	        Assert.assertTrue(product.isDisplayed(), "Product search failed!");
	    }

	    // Test Case 2: Verify checkout functionality
	    @Test
	    public void testCheckout() {
	        System.out.println("Executing testCheckout...");
	        WebElement product = driver.findElement(By.xpath("//h2[contains(text(), 'Laptop')]"));
	        WebElement addToCartButton = driver.findElement(By.id("addToCart"));

	        product.click();
	        addToCartButton.click();

	        // Verify product added to cart
	        WebElement cart = driver.findElement(By.id("cart"));
	        Assert.assertTrue(cart.isDisplayed(), "Product not added to cart!");
	    }

	    // This will run once after all test methods in the suite
	    @AfterTest
	    public void tearDown() {
	        System.out.println("Closing browser after tests...");
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

}
