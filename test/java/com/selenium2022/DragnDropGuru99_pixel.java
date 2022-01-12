package com.selenium2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragnDropGuru99_pixel {				

    @Test		
    public void DragnDrop() throws InterruptedException					
    {		
         System.setProperty("webdriver.chrome.driver","/Users/jannatulnayeem/eclipse-workspace1/com.selenium2022/driver/chromedriver");					
         WebDriver driver= new ChromeDriver();					
         driver.get("http://demo.guru99.com/test/drag_drop.html");		
         
         driver.manage().window().maximize();
     
        //Element(BANK) which need to drag.		
        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));					
      
        //Using Action class for drag and drop.		
        Actions act=new Actions(driver);					
      
        // Drag and Drop by Offset.		
        //  act.dragAndDropBy(From,135, 40).build().perform();		// not working
        Thread.sleep(5000);
        act.dragAndDropBy(From, 135, 40).build().perform();
    
    }
}