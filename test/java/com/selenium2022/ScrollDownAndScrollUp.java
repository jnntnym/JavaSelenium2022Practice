package com.selenium2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDownAndScrollUp {
	
	    @Test
	    public void ByVisibleElement() throws InterruptedException {
	      
	    	System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace1/com.selenium2022/driver/chromedriver");
	       
	    	WebDriver driver = new ChromeDriver();
	        
	    	JavascriptExecutor js = (JavascriptExecutor) driver;

	        //Launch the application and Maximize	
	        driver.get("http://demo.guru99.com/test/guru99home/");
	        
	        driver.manage().window().maximize();
	
	        //This will scroll the web page till end....		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	         
	         //wait Again Scroll Up by find element
	         Thread.sleep(5000);
	        
	         JavascriptExecutor jp = (JavascriptExecutor) driver;
	        
	         WebElement element1 = driver.findElement(By.linkText("Quiz"));
	         jp.executeScript("arguments[0].scrollIntoView();", element1);
	        
	    }

}
