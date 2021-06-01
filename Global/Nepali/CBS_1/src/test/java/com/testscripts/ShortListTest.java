package com.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.IntermediatePages;
import com.pom.LoginPage;
import com.pom.ShortList;
import com.pom.SortScroll;
import com.pom.URL;

public class ShortListTest extends Base{
	
	WebDriver driver;
	
	
	   @BeforeTest
	   public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		

	}
	   
	   @BeforeMethod
	   public void shortList() throws Throwable {
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   driver.get(URL.getURL());
		   driver.manage().window().maximize();
		   LoginPage.getLogin(driver,"nep140549","testpass");
		   Thread.sleep(2000);
		   IntermediatePages.intermediatePagesClose(driver);
		}
	   
	   @Test(enabled=true)
	   public void shortlistLatestMatches() throws Exception {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 
			 Base.click(driver.findElement(By.xpath("//*[@id=\"matchpop\"]/div[2]/div/div[1]/ul/li[4]/a")));
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(5000);
			 driver.findElement(By.id("shortlistOpt")).click();
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"mm_dontshow\"]/div[3]/input")).click();
			// Base.waitElementToPresent(s.getMatri_id());
			 Thread.sleep(5000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 
			// Base.waitElementToPresent(s.getShortlist_btn());
			 Thread.sleep(5000);
			 Base.click(s.getShortlist_btn());
			 System.out.println("clicked on shortlist button");
			 Thread.sleep(3000);
			 Base.click(s.getShorlisted_popup());
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
			 
			 

	}
	   
	   @Test(enabled=true)
	   public void shortlistYTBW() throws Exception {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   SortScroll a = new SortScroll(driver);
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(a.getYet_to_viewed());
			
			 Thread.sleep(5000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 Thread.sleep(5000);
			 acc.moveToElement(s.getShortlist_btn()).build().perform();
			 Thread.sleep(2000);
			 Base.click(s.getShortlist_btn());
			 System.out.println("Clicked on shortlist button");
			 Thread.sleep(3000);
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
			 

	}
	
	
	   @Test(enabled=true)
	   public void shortlistMLFM() throws Exception {
		
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   SortScroll a = new SortScroll(driver);
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(a.getMember_who_might_like_you());
			 
			 Thread.sleep(1000);
			 driver.findElement(By.id("shortlistOpt")).click();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("chatbuddylistwin")).click();
			 
			 Thread.sleep(1000);
			 driver.findElement(By.id("shortlistOpt")).click();
		
			 Thread.sleep(3000);
			 acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"lfm_dontshow\"]/div[3]/input"))).build().perform();
			 driver.findElement(By.xpath("//*[@id=\"lfm_dontshow\"]/div[3]/input")).click();
			// Base.waitElementToPresent(s.getMatri_id());
			 Thread.sleep(5000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 
			// Base.waitElementToPresent(s.getShortlist_btn());
			 Thread.sleep(5000);
			 Base.click(s.getShortlist_btn());
			 
		//	 Base.waitElementToPresent(s.getShorlisted_popup());
			 Thread.sleep(3000);
		//	 Base.click(s.getShorlisted_popup());
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
			 

	   }
	   
	   @Test(enabled=true)
	   public void shortlistPremium_matches() throws Exception {
		
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   SortScroll a = new SortScroll(driver);
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(a.getPremium_members());
			 
			
			// Base.waitElementToPresent(s.getMatri_id());
			 Thread.sleep(5000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 
			// Base.waitElementToPresent(s.getShortlist_btn());
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getShortlist_btn()).build().perform();
			 Thread.sleep(2000);
			 Base.click(s.getShortlist_btn());
			 
		//	 Base.waitElementToPresent(s.getShorlisted_popup());
			 Thread.sleep(3000);
		//	 Base.click(s.getShorlisted_popup());
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
	   }
	   
			 

			 ///////////   Logout
			
	   
	   @Test(enabled=true)
	   public void shortlistMutual_matches() throws Exception {
		
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   SortScroll a = new SortScroll(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 30);
		   JavascriptExecutor js  = (JavascriptExecutor)driver;
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(a.getMutual_matches());
		
			 Thread.sleep(1000);
			 driver.findElement(By.id("shortlistOpt")).click();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("chatbuddylistwin")).click();
			 
			 Thread.sleep(1000);
			 driver.findElement(By.id("shortlistOpt")).click();
		
			 Thread.sleep(3000);
			 acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"mm_dontshow\"]/div[3]/input"))).build().perform();
			 driver.findElement(By.xpath("//*[@id=\"mm_dontshow\"]/div[3]/input")).click();
		//	 wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("(//input[@type='button'])[4]"))));
      //   js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//input[@type='button'])[4]")));
			// Base.waitElementToPresent(s.getMatri_id());
			 Thread.sleep(10000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 
			// Base.waitElementToPresent(s.getShortlist_btn());
			 Thread.sleep(5000);
			 Base.click(s.getShortlist_btn());
			 
		//	 Base.waitElementToPresent(s.getShorlisted_popup());
			 Thread.sleep(3000);
		//	 Base.click(s.getShorlisted_popup());
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
			 ///////////   Logout
			
			 

	}
	
	   
	   @AfterTest
	   public void teardown() throws Exception {
		
		/*   Actions acc = new Actions(driver);
		   ///////////   Logout
			 System.out.println("  >  >  >  >  >  >  >  >  >");
			 Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
			Thread.sleep(1000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[3]/a"))).build().perform();
			driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[3]/a")).click();
			 System.out.println("Logged Out Successfully");  */
	}

}
