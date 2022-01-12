package com.selenium2022;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMonthList {
	
	//Print all the months from drop-down list & also the default month
		@Test
		public void dropDown() {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://qa.taltektc.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(200,TimeUnit.MILLISECONDS);
			
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equalsIgnoreCase("Sign In")) {
				System.out.println("Right Page");
			}
			else {
				System.out.println("Wrong Page");
			}
			
			driver.findElement(By.className("new-account")).click();
			
			WebElement months = driver.findElement(By.name("month"));
			
			Select select = new Select(months);
			List<WebElement> options = select.getOptions();
//			for(int i =0; i<options.size(); i++) {				// print all months name
//				System.out.println(options.get(i).getText());
//			}
			//*******************OR*****************
			for(WebElement month:options)  
			{  
			 System.out.println(month.getText());  
			} 
			
			System.out.println("The Default value selected is : " +select.getFirstSelectedOption().getText());
		}

	}
