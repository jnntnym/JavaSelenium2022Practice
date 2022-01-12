package com.selenium2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTTK {
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qa.taltektc.com/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.name("email")).sendKeys("nayeemsisir20@gmail.com");
		driver.findElement(By.name("password")).sendKeys("n@123456#");
		driver.findElement(By.className("my-login")).click();
		
		driver.findElement(By.linkText("Drag & Drop")).click();
		
		System.out.println(driver.getTitle());
		
		String text = driver.findElement(By.xpath("//div[@id=\"page-content-wrapper\"]/div/center/div[1]")).getText();
		System.out.println(text);
		
		WebElement drag =driver.findElement(By.xpath("//div[@id='boxA']"));
		WebElement drop= driver.findElement(By.xpath("//div[@id='boxB']"));  
		
		// put your mouse pointer on drop box simply before drag action, other wise fail
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		
		action.dragAndDrop(drag, drop).build().perform();		// passed if mouse pointer on drop box
		
		//action.dragAndDropBy(drag, 260, 200).build().perform();	// Method 2: by pixel ; passed if mouse pointer on drop box
	
	}

}
