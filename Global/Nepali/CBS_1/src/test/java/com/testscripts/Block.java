package com.testscripts;

import java.awt.AWTException;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.ShortList;

public class Block  extends Base{

	
	
	WebDriver driver;
	
	
	   @BeforeMethod
	   public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		

	}
	   
	   @Test
	   public void shortList() throws InterruptedException, AWTException {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 30);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   Base.click(i.getMatriId());
		   Base.typeData(i.getMatriId(), "nep140549");
		   
		   Base.click(i.getPaswwordclr());
		   Base.typeData(i.getPassword(), "cbstest");
		   
		   Base.click(i.getLoginbtn());
		   
		   try {
				WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
				if (photo_add.isDisplayed()) {
					photo_add.click();
					driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
					driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
					
				}
				
			} catch (Exception e) {
				System.out.println("Photo Page Skipped");
			}
			
			
			try {
				WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				if (skip_matches.isDisplayed()) {
					skip_matches.click();
					
				}
			} catch (Exception e) {
				System.out.println("Intermediate pages handled");
			}
			
			try {
				WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
				if (element.isDisplayed()) {
					element.click();
					
				}
			} catch (Exception e) {
				System.out.println("Intermediate pages handled");
			}
			
			try {
				WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();
					
				}
			} catch (Exception e) {
				System.out.println("Intermediate pages handled");
			}
			
			try {
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			// AD Pages
			 
			 try {
				 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				System.out.println("ADs Closed Successfully");
			}
			 
			 
			 
			 
			 //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(s.geMatches());
			 
			 Thread.sleep(3000);
		//	 driver.findElement(By.id("shortlistOpt")).click();
			 
			 Thread.sleep(1000);
	//		 driver.findElement(By.xpath("//*[@id=\"save_srch_link\"]/div[5]/div[3]/input")).click();
			// Base.waitElementToPresent(s.getMatri_id());
			 
			 Thread.sleep(5000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID 1: " + Id);
			 
			 Thread.sleep(5000);
			 String IDd = driver.findElement(By.xpath("//*[@id=\"hide_no_result\"]/div[1]")).getText();
			 System.out.println("2 "+IDd);
			 
			 Thread.sleep(3000);
			 Base.click(s.getShortlist_viewprofile());
			 
				String parent = driver.getWindowHandle();
				System.out.println("Parent Window ID is  " + parent);
				Thread.sleep(3000);
			 
			 Set<String> winHandles = driver.getWindowHandles();
				int count = winHandles.size();
				System.out.println("Window Count is : " + count);
				for (String winHandle : winHandles) {
					if (!parent.contains(winHandle)) {
						Thread.sleep(3000);
						driver.switchTo().window(winHandle);
					}

					System.out.println("window Handle Id :" + winHandle);

				}
				System.out.println("Handled");
				
				
				////////////////////////  survey Page Handle////////////////////////////////////
				Thread.sleep(3000);
				try {
					
					driver.findElement(By.id("SurveyPopupClose")).click();
					
				} catch (Exception e) {
					
					System.out.println("No Survey Pop Page ");
					
				}
				
			/*	Thread.sleep(3000);
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_MINUS);
				r.keyRelease(KeyEvent.VK_MINUS);
				r.keyRelease(KeyEvent.VK_CONTROL);  */
				
				//////////////////////////////////////////////////////////////////////////////
			 
			Thread.sleep(3000);
			String oppId=driver.findElement(By.xpath("//*[@id=\"oppositeMemberId\"]")).getText();
			System.out.println("Matri id: "+oppId);
			//js.executeScript("window.scrollBy(0,350)");
			Thread.sleep(5000);
			WebElement dropdown=driver.findElement(By.xpath("(//*[contains(@id,'sp_conversation_top_')])[1]"));
		
			Base.click(driver.findElement(By.xpath("(//*[contains(@id,'sp_conversation_top_')])[1]")));
			Thread.sleep(2000);
			System.out.println("Clicked on dropdown");
			
			///////// /////// /////////  Scroll Using Javascripts //////// //////////
			//js.executeScript("window.scrollTo(200,0");
			Thread.sleep(3000);
			//Base.click(driver.findElement(By.xpath("//*[contains(@id,'infiniteblockconfirmbtn_')]")));
			
			
			
			
			 
						 
	/*		 Thread.sleep(3000);
		//	 Base.click(driver.findElement(By.id("Latshortlist_"+IDd+"")));
			 
			 
			 System.out.println("The Profile was Blocked  Using Block Button");
			 
			 Thread.sleep(3000);
			 
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
			 
			 			 
			 
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : 3 " + Ids);
			 
			
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Blocked  Id matches with the Profile Blocked By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}*/
			 
		
			 
			 
	   }
	   
}