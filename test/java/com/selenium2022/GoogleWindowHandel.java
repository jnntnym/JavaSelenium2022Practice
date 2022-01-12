package com.selenium2022;

/*
 * Q:-Open the site "https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp&quot; 
 * then click 'Help', 'Privacy' and 'Terms' switch to each window & print title 
 */

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleWindowHandel {
	
	@Test
	public void windowHandel() {
		
		String BASE_URL = "https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp&quot";
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/jannatulnayeem/eclipse-workspace1/OnlineSelenium2021/jar/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(BASE_URL);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click(); 
		driver.findElement(By.linkText("Terms")).click();
			
		// Find total active tab
		Set<String> totalTab = driver.getWindowHandles();		// like 4
		System.out.println(totalTab);
		//System.out.println(totalTab.toString());

	
		// Start: Read/Iterate all active tab
		Iterator<String> iterateTab = totalTab.iterator();
		String createAccTab = iterateTab.next();				//  Parent Tab: Create your Google Account  from url
		String termsTab 	= iterateTab.next();
		String privacyTab = iterateTab.next();
		String helpTab = iterateTab.next();
		
		//Parent to help 
		driver.switchTo().window(helpTab);
		System.out.println(driver.getTitle());		//	Google Account Help
		driver.close();
	
		// Help to Parent
		driver.switchTo().window(createAccTab);
		System.out.println(driver.getTitle());		//	Create your Google Account

		//Parent to Privacy Tab
		driver.switchTo().window(privacyTab);
		System.out.println(driver.getTitle());		// Privacy Policy – Privacy & Terms – Google
		driver.close();
		
		//Privacy to Parent (No need to title print)
		driver.switchTo().window(createAccTab);

		//Parent to Terms Tab 
		driver.switchTo().window(termsTab);			//Google Terms of Service – Privacy & Terms – Google
		System.out.println(driver.getTitle());
		driver.close();
		
		//Terms to Parent (No need to title print)
		driver.switchTo().window(createAccTab);
		//System.out.println(driver.getTitle());
		
		//driver.quit();
		 
		 
	}

}
