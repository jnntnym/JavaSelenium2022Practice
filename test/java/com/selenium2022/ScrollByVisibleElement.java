package com.selenium2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByVisibleElement {
	
	    @Test
	    public void ByVisibleElement() throws InterruptedException {
	      
	    	System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace1/com.selenium2022/driver/chromedriver");
	       
	    	WebDriver driver = new ChromeDriver();
	        
	    	JavascriptExecutor js = (JavascriptExecutor) driver;

	        //Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");
	        
	        driver.manage().window().maximize();

	        //Find element by link text and store in variable "element"        		
	        WebElement element = driver.findElement(By.linkText("Jobs"));
	       
	        // This will scroll the page till the element is found; “arguments[0]” means first index of page starting at 0.	
	        // scrollIntoView() method: Where an ” element ” is the locator on the web page.
	        js.executeScript("arguments[0].scrollIntoView();", element);
	        	        
	    }

}
