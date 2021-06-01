package com.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.IntermediatePages;
import com.pom.LoginPage;
import com.pom.ShortList;
import com.pom.URL;

public class ShortListViewProfile extends Base {
	
	WebDriver driver;
	
	
	   @BeforeMethod
	   public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		

	}
	   
	   @Test
	   public void shortList() throws Throwable {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 30);
		   
		   driver.get(URL.getURL());
		   driver.manage().window().maximize();
		   LoginPage.getLogin(driver, "nep140549", "cbstest");
		   IntermediatePages.intermediatePagesClose(driver);
			 //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id=\"matchpop\"]/div[2]/div/div[1]/ul/li[3]/a")).click();
			 Thread.sleep(3000);
			 WebElement ele=driver.findElement(By.xpath("//*[text()=\"Active\"]"));
			 acc.moveToElement(ele).build().perform();
			 driver.findElement(By.id("shortlistOpt")).click();
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"lfm_dontshow\"]/div[3]/input")).click();
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
				
				//////////////////////////////////////////////////////////////////////////////
			 
			Thread.sleep(6000);
			 Base.click(s.getViewprofile_shrtlist_btn());
 
			 Thread.sleep(3000);
		//	 Base.click(driver.findElement(By.id("Latshortlist_"+IDd+"")));
			 
			// Base.takeSnapShot(driver, "shortlistpopup");
			 System.out.println("The Profile was Shortlisted Using Shortlist Button"); 
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : 3 " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
			 

			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	
	   }
	

}
