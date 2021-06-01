package com.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.IntermediatePages;
import com.pom.LoginPage;
import com.pom.ProfileViewNotContacted;
import com.pom.URL;

public class ShortlistedMeScroll extends Base {
	
	WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		
		  System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--disable-notifications");
         driver = new ChromeDriver(options);
         
	}
	
	
	@Test
	public void whoShortlistedMeScrollTest() throws Throwable {
		
		Inbox i  =  new Inbox(driver);
		ProfileViewNotContacted p = new ProfileViewNotContacted(driver);
		Actions acc = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.get(URL.getURL());
		driver.manage().window().maximize();
		LoginPage.getLogin(driver,"nep140549","cbstest");
		IntermediatePages.intermediatePagesClose(driver);
		Thread.sleep(3000);
		 acc.moveToElement(p.getMy_home()).build().perform();
		 acc.moveToElement(p.getProfile_shortlisted_my_me()).build().perform();
		 Thread.sleep(3000);
		 Base.click(p.getProfile_shortlisted_my_me());
		 Thread.sleep(3000);
		 ///////////////////////////////////////////////////
		 String a = driver.findElement(By.id("dispidListCnt")).getText();
		 System.out.println(a);
		 Integer b = Integer.parseInt(a);
		 System.out.println(b);
		 int count = (b/10);
		 System.out.println(count);
		 
		 //////////////////////////////////////////////////////////////////////////////////////////
		 
		 if (count>10) {
			  for (int j = 0; j <=count-1; j++) {
				  
				  for (int k = 0; k <=11; k++) {
					  Thread.sleep(1000);
					  js.executeScript("window.scrollBy(0,350)");
					
				}
				  
				  try {
					Thread.sleep(2000);
					Base.click(p.getNext());
				} catch (Exception e) {
					e.getMessage();
				}
				
			}
			
		} else {
               System.out.println("Scroll is not needed because profile is less than 10");
		}
		
		Thread.sleep(15000);
		try {
			driver.findElement(By.xpath("//*[@id='result0']")).click();		
			
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				if (parent.equals(child)) {
					driver.switchTo().window(handle);
					Thread.sleep(5000);
					driver.close();
					
				}
				driver.switchTo().window(parent);
				
			
		}
        
			
		}
		catch(Exception e) {
			e.getMessage();
		}
		
		//////////////////////////////////////   Logout
		
			 
			
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
