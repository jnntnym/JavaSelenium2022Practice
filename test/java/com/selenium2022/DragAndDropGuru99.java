package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropGuru99 {
	
	 	

    @Test		
    public void DragnDrop() throws InterruptedException					
    {		
         System.setProperty("webdriver.chrome.driver","/Users/jannatulnayeem/eclipse-workspace1/com.selenium2022/driver/chromedriver");					
         WebDriver driver= new ChromeDriver();					
         driver.get("http://demo.guru99.com/test/drag_drop.html");	
         driver.manage().window().maximize();
 		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 		
         
		//Element which needs to drag.    		
         WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
         		
         //Using Action class for drag and drop. we create object of Actions class as we use methods of Actions class.		
         Actions act=new Actions(driver);					

         //Dragged and dropped.		
         Thread.sleep(5000);
         act.dragAndDrop(From, To).build().perform();	
     
	}		

}
