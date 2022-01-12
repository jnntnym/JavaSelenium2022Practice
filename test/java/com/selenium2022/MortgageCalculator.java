package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MortgageCalculator {
	
	@Test
	public void mortgageCalculator() {
		
		WebDriverManager.chromedriver().setup();  // from pom.xml git hub dependency
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().equalsIgnoreCase("Mortgage Calculator")) {
			
			System.out.println("Test pass- You are in a correct page");
			
		}else {
			System.out.println("Test failed- You are in a wrong page");
		}
		
		driver.findElement(By.id("homeval")).sendKeys("1000000");
		driver.findElement(By.id("downpayment")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@value='money']")).click();
		driver.findElement(By.id("loanamt")).getAttribute("value");
		
		System.out.println(driver.findElement(By.id("loanamt")).getAttribute("value"));
		
		driver.findElement(By.id("intrstsrate")).sendKeys("3.0");
		
		driver.findElement(By.id("loanterm")).sendKeys("25");
		
		WebElement month = driver.findElement(By.name("param[start_month]"));
		Select sel = new Select(month);
		sel.selectByValue("3");
		
		driver.findElement(By.id("start_year")).sendKeys("2022");
		driver.findElement(By.className("styled-button")).click();
				
		
	}
	

}
