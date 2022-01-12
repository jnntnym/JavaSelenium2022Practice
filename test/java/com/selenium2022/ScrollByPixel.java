package com.selenium2022;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByPixel {
	
    @Test
    
    public void ByPixel() {
       
    	System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace1/com.selenium2022/driver/chromedriver");
        
        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
        driver.manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,5000)");
   
    }

}
//Script Description: In the above code first we launch the given URL in Chrome browser. 
//Next, scroll the page by 1000 pixels through executeScript. Javascript method ScrollBy() scrolls the web page to the specific number of pixels.
//The syntax of ScrollBy() methods is :
//executeScript("window.scrollBy(x-pixels,y-pixels)");
//x-pixels is the number at x-axis, it moves to the left if number is positive and it move to the right if number is negative 
//y-pixels is the number at y-axis, it moves to the down if number is positive and it move to the up if number is in negative .