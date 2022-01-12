package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderAutomate_Jquery {
	
	@Test
	public void sliderAutomate() {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace1/com.selenium2022/driver/chromedriver");

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://jqueryui.com/slider/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.switchTo().frame(0);				  										// //*[@id="slider"]/span
	        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));	// slider button .. //*[@id=\"slider\"]/span

	        Actions action = new Actions(driver);
	        action.dragAndDropBy(slider, 100, 0).perform();  // here is y=0, because no vertical
		
	}

}
