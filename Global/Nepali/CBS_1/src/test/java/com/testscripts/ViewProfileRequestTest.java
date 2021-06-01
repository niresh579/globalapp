package com.testscripts;


import java.util.List;
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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.pom.Horoscope;
import com.pom.Inbox;
import com.pom.ShortList;
import com.pom.ViewProfileScroll;

public class ViewProfileRequestTest extends Base {
	
	
	WebDriver driver;
	   @BeforeMethod
	   public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		

	}
	   
	   @Test(priority=1)
	   public void viewProfileRequesstTest() throws InterruptedException, Exception {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   ViewProfileScroll v = new ViewProfileScroll(driver);
		   Horoscope h = new Horoscope(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 60);
		   
		   
		   driver.get("https://www.nepalimatrimony.com/");
		   driver.manage().window().maximize();
		   
		   Base.click(i.getMatriId());
		   Base.typeData(i.getMatriId(), "nep140549");
		   
		   Base.click(i.getPaswwordclr());
		   Base.typeData(i.getPassword(), "cbstest");
		   
		   Base.click(i.getLoginbtn());
		   
		   ////////////// Intermediate Pages
		   
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
			 Base.click(driver.findElement(By.xpath("//*[@id=\"matchpop\"]/div[2]/div/div[1]/ul/li[4]/a")));

			 /////// Dont show Profile Button Handel///
			 
			 Thread.sleep(3000);
			 
			 WebElement activeText=driver.findElement(By.xpath("//*[text()=\"Active\"]"));
			 acc.moveToElement(activeText).build().perform();
			 Thread.sleep(1000);
			 Base.click(v.getContact_radio_btn());
			 
			 Base.click(v.getView_radio_btn());
			 
			 Base.click(v.getShortlist_radio_button());
			 
			 Base.click(v.getBlock_radio_btn());
			 
			 Base.click(v.getIgnore_radio_btn());
			 
			 Base.click(v.getDnt_show_submit());
			 
			 //////////////////////////////////////////////
			 
			 Thread.sleep(3000);
			 Base.click(v.getView_profile_click());
			 
			 
			 ///////////  Window Handling  
			 
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
				
				////////////////////////////////////////////////
				
				/*   Survey  Handle  */
				
				try {
					Thread.sleep(3000);
					Base.click(v.getSurvey_pop_up_close());
				} catch (Exception e) {
					System.out.println("No Survey Button to handle");
				}
				
	   	
				////////////////////////////////////////////
			//	(//span[@ng-click='requestfor($event)'])
			List<WebElement> request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
			int size = request.size();
			
			
			for (int j = 0; j<=size-1; j++) {
				
				Thread.sleep(5000);
				
				 Thread.sleep(1000);
				 request.get(j).click();
		      
		      try {
		      Thread.sleep(3000);
		      driver.findElement(By.id("accept_close")).click();
		      } catch (Exception e) {
				e.getMessage();
			}
			}
			
			System.out.println("All Request Sent Succesfully ");
			//*[@id="userpop"]/div[2]/div/div[3]/div[2]/ul/li[3]/a
			
///////////////  Logout   //////////////////////////////////////////
//			 Thread.sleep(3000); 
//		  acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/div/img"))).build().perform();
//		  Thread.sleep(3000); 
//		  acc.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[1]"))).build().perform();
//		  Thread.sleep(1000);
//		  Base.click(driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[1]")));
//		  
//		System.out.println("Logged out successfully");
//	
	   }
	   
	   
	   @AfterTest
	   public void tearDown() {

         //  driver.quit();
           System.out.println("Browser Closed Successfully");
		   
	}
}
