package com.selenium2022;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByPage {
	
	    @Test
	    public void ByPage() {
	        System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace1/com.selenium2022/driver/chromedriver");
	        WebDriver driver = new ChromeDriver();

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");
	        
	        driver.manage().window().maximize();

	        //This will scroll the web page till end.		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    }

}
//Script Description : In the above code, we first launch the given url in Chrome browser. 
//Next, scroll till the bottom of the page. Javascript method scrollTo() scroll the till the end of the page .
//“document.body.scrollHeight” returns the complete height of the body i.e web page.