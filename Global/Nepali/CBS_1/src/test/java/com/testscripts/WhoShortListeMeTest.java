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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.IntermediatePages;
import com.pom.LoginPage;
import com.pom.SortScroll;
import com.pom.URL;
import com.pom.WhoShortListMe;

public class WhoShortListeMeTest extends Base {
	
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}
	
	
	@Test
	public void whoShortListedMe() throws Throwable {
		
		WhoShortListMe w =new WhoShortListMe(driver);
		Actions acc= new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get(URL.getURL());
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//.......login to the app...........
		String un=Base.getexcel1("login", 1, 0);
		String pwd=Base.getexcel1("login", 1, 1);
	    LoginPage.getLogin(driver, un, pwd);
	    Thread.sleep(2000);
	    //.............closing intermediate pages.........
	    IntermediatePages.intermediatePagesClose(driver);  
	     Thread.sleep(5000);
			 acc.moveToElement(w.getMy_home()).build().perform();
			 Thread.sleep(1000);
			 
			 acc.moveToElement(w.getWho_shortlisted_me()).build().perform();
			 Thread.sleep(1000);
			 Base.click(w.getWho_shortlisted_me());
			 Thread.sleep(3000);
			 
			 String whoshortlistcount = w.getShortlisted_me_profile_count().getText();
			 Integer count = Integer.parseInt(whoshortlistcount);
			
			 System.out.println(count);
			 int count_c = (count/10);
			 System.out.println(count_c);
			 
			 int count_cc = (int) Math.ceil(count_c);
			 System.out.println(count_cc);
			 
		///////////////////////////////////////////////////////////////////////	 
			 if (count<10) {
				
			for (int i = 0; i < 1; i++) {
				
				  for (int j = 0; j <=12; j++) {
					  Thread.sleep(3000);
						js.executeScript("window.scrollBy(0,350)"); 
						System.out.println("The Scroll Completed are : "+j);
				}
					}
			 
			 }  else {
				System.out.println("  * * *   ");
			}
			 
			 
		///////////////////////////////////////////////////////	 
			 if (count>10) {
				 
				 for (int i = 0; i < count_cc; i++) {
					 
					 for (int j = 0; j <=12; j++) {
						  Thread.sleep(3000);
							js.executeScript("window.scrollBy(0,350)"); 
						//	System.out.println("The Scroll Completed are : "+j);
							
					}
					 
					 try {	
						 Thread.sleep(2000);
						  Base.click(w.getNext_btn());
						  Base.click(driver.findElement(By.id("chatbuddylistwin")));
						  Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("No Next Button");
				}  
					
					
				}
				
			} else {
				System.out.println(" * * * * * * * *   ");
			}
			 
			 Thread.sleep(3000);
		///////////////////////////////////////////////////////////	 
			 Thread.sleep(5000);
		//		Base.click(w.getShortlist_icon_btn());
				
				
				Thread.sleep(3000);
				Base.click(w.getView_profile_btn());
				
				Thread.sleep(3000);
				String parent = driver.getWindowHandle();
				
				Set<String> child = driver.getWindowHandles();
				for (String handle : child) {
					if (!parent.equals(child)) {
						
						Thread.sleep(1000);
						driver.switchTo().window(handle);
						
					}
					
				}
				
				
				Thread.sleep(3000);
				
				List<WebElement> Details = driver.findElements(By.xpath("//div[@class='detailbox']"));
				
				for (int i = 0; i < Details.size(); i++) {
					
					String Deta = Details.get(i).getText();
					System.out.println(Deta);
					
				}
				
				
				
			
				
				Thread.sleep(2000);
			//	js.executeScript("window.scrollBy(0,-500"); 
				
				Thread.sleep(3000);
				if (w.getView_profile_mobile_no_btn().isDisplayed()) {
					
					Base.click(w.getView_profile_mobile_no_btn());
					
					Thread.sleep(2000);
					if (w.getMble_number_Send_sms_btn().isDisplayed()) {
						
						
						System.out.println(" Send SMS");
						
						
						System.out.println("View Mobile Number");
						
							
						
						Base.click(w.getVeiw_mble_no_close_btn());
						
					}else {
						
						
						System.out.println("Upgrade to view Mobile Number @ Send SMS");
						
					}
					
				}
				
				
				Thread.sleep(3000);
				if (w.getView_profile_shortlist_btn().isEnabled()) {
					
					Base.click(w.getView_profile_shortlist_btn());
					
					
					
				} else {
					System.out.println("Profile Already Shortlisted");
				}
				
				
				Thread.sleep(3000);
				if (w.getView_profile_horoscope_icon().isEnabled()) {
					
					Base.click(w.getView_profile_horoscope_icon());
					
					Thread.sleep(2000);
					Base.click(w.getDownload_horoscope());
					
					Thread.sleep(1000);
					Base.click(w.getHoroscope_close_btn());
					
				} else {
					
					System.out.println("Horoscope is not Uploaded ");

				}
				
				
            	Thread.sleep(3000);
				
				if (w.getView_profile_request_btn().isDisplayed()) {
					
					Thread.sleep(2000);
					
					List<WebElement> Request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
					
					for (int j = 0; j < Request.size()-1; j++) {
						
						Request.get(j).click();
				
					} 
					
				} else {
					System.out.println("No Request For Button");
				}
				

				try {
					Thread.sleep(3000);
					Base.click(w.getRequest_close_btn());
				} catch (Exception e) {
					
				}
				
				
							
			 
	}
	
	@AfterTest
	public void mail() {
		Base.reportflush1();

	}

}
