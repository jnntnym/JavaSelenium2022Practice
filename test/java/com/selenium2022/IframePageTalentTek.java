package com.selenium2022;
/*
 * -In the TalentTek site go to Iframe page verfiy page header then print " :) Oops!" then print "Create a responsive video and scale it 	nicely to the parent element with an 16:9 aspect ratio" 
 * 
 */


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframePageTalentTek {
	
	@Test
	public void iframePageVerifyandPrint() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace1/OnlineSelenium2021/jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qa.taltektc.com/home/login");
		System.out.println("title of the page: " + driver.getTitle());

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		// Log in
		driver.findElement(By.xpath("//input[@class='ttc_email']")).sendKeys("nayeemsisir20@gmail.com");
		driver.findElement(By.xpath("//input[@class='ttc_password']")).sendKeys("n@123456#");
		driver.findElement(By.xpath("//input[@class='my-login']")).click();
		// Iframe
		driver.findElement(By.linkText("iFrame")).click();
		// Run
		driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
		
		//iframe or frameset (found how many iFrame)
		// There is two type of tag name 1. iframe and 2. frame set
		List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		System.out.println(frameCount.size());		// for list size method  
		// Parent to child 		
		driver.switchTo().frame(0);		// index value of frame		: entry to frame															//h1[contains(text(),':) Oops!')]
		System.out.println(driver.findElement(By.xpath("//div[@class='error-template']/h1[1]")).getText()); //div[@class='error-template']/h1[1]  
		// Return to parent
		driver.switchTo().defaultContent();		// exit from iframe
		System.out.println(driver.findElement(By.xpath("//div[@class='container-fluid']/p")).getText());	//div[@class='container-fluid']/p
		
		//driver.close();
	
	}
	     
}

