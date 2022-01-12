package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderAutomate_TTK2 {
	
	@Test
	public void sliderAutomate() {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace1/com.selenium2022/driver/chromedriver");

	        WebDriver driver = new ChromeDriver();
	        driver.get("http://qa.taltektc.com/home/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			driver.findElement(By.name("email")).sendKeys("nayeemsisir20@gmail.com");
			driver.findElement(By.name("password")).sendKeys("n@123456#");
			driver.findElement(By.className("my-login")).click();
			driver.findElement(By.linkText("Range Slider")).click();
		
	        WebElement slider = driver.findElement(By.xpath("//*[@id=\"myRange\"]"));	// slider button ..

	        Actions action = new Actions(driver);
	        action.dragAndDropBy(slider, 70, 0).perform();  // here is y=0, because no vertical
		
	}

}
