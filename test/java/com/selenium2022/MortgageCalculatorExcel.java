package com.selenium2022;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MortgageCalculatorExcel {
	
	
		@Test
			public void mortcalculator() throws IOException, InterruptedException {
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.mortgagecalculator.org/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
				
				FileInputStream file=new FileInputStream("/Users/jannatulnayeem/Desktop/excel/mortgage.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet Sheet = workbook.getSheet("Sheet1");
				
				System.out.println(Sheet.getRow(0).getCell(0));
				System.out.println(Sheet.getRow(1).getCell(0));	
				System.out.println(Sheet.getRow(0).getCell(1));
				System.out.println(Sheet.getRow(1).getCell(1));
				
				
				driver.findElement(By.id("homeval")).sendKeys(Sheet.getRow(1).getCell(0).toString());
				driver.findElement(By.id("downpayment")).sendKeys(Sheet.getRow(1).getCell(1).toString());
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[17]/input")).click();
				
				workbook.close();
		
		}
	
}
