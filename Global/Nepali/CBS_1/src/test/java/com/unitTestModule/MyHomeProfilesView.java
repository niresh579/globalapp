package com.unitTestModule;

import java.util.List;
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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Horoscope;
import com.pom.Inbox;
import com.pom.ShortList;
import com.pom.ViewProfileScroll;

public class MyHomeProfilesView extends Base{
	

	WebDriver driver;
	
	
	
	   @BeforeTest
	   public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		

	}
	   
	   @BeforeMethod
	   public void login() throws Exception {
		   
			   Inbox i = new Inbox(driver);
			   
			   WebDriverWait wait = new WebDriverWait(driver, 60);
			   
		try {	   
			   driver.navigate().to("https://www.communitymatrimony.com/");
			   driver.manage().window().maximize();
			   
			   Base.click(i.getMatriId());
			   Base.typeData(i.getMatriId(), "EZH710533");
			   
			   Base.click(i.getPaswwordclr());
			   Base.typeData(i.getPassword(), "cbstest");
			   
			   Base.click(i.getLoginbtn());
		} catch (Exception e) {
			System.out.println("Already Logged iN");
		}   
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
				 Thread.sleep(5000);
				 try {
					 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
				} catch (Exception e) {
					System.out.println("ADs Closed Successfully");
				}
			  
				 
	}
	   
 /*	   @Test(priority=-1)
	   public void adPage() throws InterruptedException {
		// AD Pages
			 Thread.sleep(5000);
			 try {
				 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				System.out.println("ADs Closed Successfully");
			}

	}
	    */
	   
	   @Test(enabled=true)
	   public void scroll() throws Exception {
	
		   
		    Actions acc = new Actions(driver);
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 60);
			com.pom.ProfileViewNotContacted p = new com.pom.ProfileViewNotContacted(driver);
		    Inbox i = new Inbox(driver);
		    
		      
		               /*                  -- -- -- --- -- -                     */
		    
		    acc.moveToElement(p.getMy_home()).build().perform();
			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]"));
			} catch (Exception e) {
				e.getMessage();
			}
			
			acc.moveToElement(p.getProfile_viewed_not_contacted()).build().perform();
			Base.click(p.getProfile_viewed_not_contacted());
			Thread.sleep(5000);
			
			////////////////////////////////////    Direct Scroll   /////////////////////////////
			
			
			String a = p.getProfile_count().getText();
			Integer b = Integer.parseInt(a);
			System.out.println(b);
			int count = (b/10);
			System.out.println(count);
			Thread.sleep(2000);
			
			////////////////////////////////////////   Scroll Test
			
			if (count>=10) {
				Thread.sleep(1000);
				for (int j = 0; j <=3; j++) {  //j<=count-1
					Thread.sleep(1000);
					
					for (int k = 0; k <=12; k++) {
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,350)");
						
					}
					
					try {
						Thread.sleep(3000);
						Base.click(p.getNext());
					} catch (Exception e) {
						e.getMessage();
					}
					
				}
				
			} else {
	                   System.out.println("The displayed profile is less than 10");
			}
			Thread.sleep(5000);
			/////////////////////////////////   View Profile  
		wait.until(ExpectedConditions.elementToBeClickable(p.getViewProfile_click()));
			Base.click(p.getViewProfile_click());
			Thread.sleep(1000);
			
			String parent = driver.getWindowHandle();
			System.out.println("Parent Window Id : " +parent);
			
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				Thread.sleep(1000);
				if (parent.equals(child)) {
					Thread.sleep(3000);
					driver.switchTo().window(handle);			
					driver.close();
					
				}
				driver.switchTo().defaultContent();
			}  Thread.sleep(5000);   
				////////////////////////////////////////////   Logout    
				
		/*		acc.moveToElement(p.getLogout_menu()).build().perform();
				Thread.sleep(1000);
				
				acc.moveToElement(p.getLogout()).build().perform();
				Base.click(p.getLogout());
				System.out.println("Logged out successfully");  
				Thread.sleep(5000);  */
				
			}
	   
	   
	   
	   @Test (enabled=true)   ///////////  Profile Viewed not contacted with photo     ////
		public void profileViewWithPhoto() throws Exception {
			
			
			Actions acc = new Actions(driver);
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 60);
			com.pom.ProfileViewNotContacted p = new com.pom.ProfileViewNotContacted(driver);
		    Inbox i = new Inbox(driver);
		    
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		    Thread.sleep(1000);
			acc.moveToElement(p.getMy_home()).build().perform();
			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]"));
			} catch (Exception e) {
				e.getMessage();
			}
			
			acc.moveToElement(p.getProfile_viewed_not_contacted()).build().perform();
			Base.click(p.getProfile_viewed_not_contacted());
			Thread.sleep(5000);   
		  
		    Thread.sleep(5000);
		//	Base.click(p.getProfile_type_with_photo());
			Thread.sleep(5000);
			
			////////////////////////////////////    Direct Scroll   /////////////////////////////
			
			
			String a = p.getProfile_count().getText();
			Integer b = Integer.parseInt(a);
			System.out.println(b);
			int count = (b/10);
			System.out.println(count);
			Thread.sleep(2000);
			
			////////////////////////////////////////   Scroll Test
			
			if (count>=10) {
				Thread.sleep(1000);
				for (int j = 0; j <=3; j++) { // j<=count-1
					Thread.sleep(1000);
					
					for (int k = 0; k <=12; k++) {
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,350)");
						
					}
					
					try {
						Base.click(p.getNext());
					} catch (Exception e) {
						e.getMessage();
					}
					
				}
				
			} else {
	                   System.out.println("The displayed profile is less than 10");
			}
			Thread.sleep(5000);
			/////////////////////////////////   View Profile  
			Base.click(p.getViewProfile_click());
			Thread.sleep(1000);
			
			String parent = driver.getWindowHandle();
			System.out.println("Parent Window Id : " +parent);
			
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				Thread.sleep(1000);
				if (parent.equals(child)) {
					Thread.sleep(5000);
					driver.switchTo().window(handle);			
					driver.close();
					
				}
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
			} 
			Thread.sleep(5000);
			
		} 
		
		
		@Test (enabled=true) ///   Profile View not contacted with Created Date    ////////
		public void profileViewCreated() throws Exception {
			
			
			
			Actions acc = new Actions(driver);
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 60);
			com.pom.ProfileViewNotContacted p = new com.pom.ProfileViewNotContacted(driver);
		    Inbox i = new Inbox(driver);
		    
		    
		    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		    
			acc.moveToElement(p.getMy_home()).build().perform();
			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]"));
			} catch (Exception e) {
				e.getMessage();
			}
			
			acc.moveToElement(p.getProfile_viewed_not_contacted()).build().perform();
			Base.click(p.getProfile_viewed_not_contacted());
			Thread.sleep(5000);   
		  
		    Thread.sleep(5000);
			Base.click(p.getProfile_created_within_a_month());
			Thread.sleep(5000);
			
			////////////////////////////////////    Direct Scroll   /////////////////////////////
			
			
			String a = p.getProfile_count().getText();
			Integer b = Integer.parseInt(a);
			System.out.println(b);
			int count = (b/10);
			System.out.println(count);
			Thread.sleep(2000);
			
			////////////////////////////////////////   Scroll Test
			
			if (count>=10) {
				Thread.sleep(1000);
				for (int j = 0; j <=3; j++) {  //j<=count-1
					Thread.sleep(1000);
					
					for (int k = 0; k <=12; k++) {
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,350)");
						
					}
					
					try {
						Base.click(p.getNext());
					} catch (Exception e) {
						e.getMessage();
					}
					
				}
				
			} else {
	                   System.out.println("The displayed profile is less than 10");
			}
			Thread.sleep(5000);
			/////////////////////////////////   View Profile  
			Base.click(p.getViewProfile_click());
			Thread.sleep(1000);
			
			String parent = driver.getWindowHandle();
			System.out.println("Parent Window Id : " +parent);
			
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				Thread.sleep(1000);
				if (parent.equals(child)) {
					Thread.sleep(5000);
					driver.switchTo().window(handle);				
					//driver.close();
					
					
					/*  View Profile Request   */
					 ShortList s = new ShortList(driver);
					   ViewProfileScroll v = new ViewProfileScroll(driver);
					   Horoscope h = new Horoscope(driver);
					
				//	 Actions acc = new Actions(driver);
					 
					 acc.moveToElement(s.getMatches_btn()).build().perform();
					 Thread.sleep(3000);
					 acc.moveToElement(s.getLatest_matches()).build().perform();
					 Base.click(s.getLatest_matches());

					 /////// Dont show Profile Button Handel///
					 
					 Thread.sleep(3000);
					 
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
					 
						String parent1 = driver.getWindowHandle();
						System.out.println("Parent Window ID is  " + parent1);
						Thread.sleep(3000);
					 
					 Set<String> winHandles = driver.getWindowHandles();
						int count1 = winHandles.size();
						System.out.println("Window Count is : " + count1);
						for (String winHandle : winHandles) {
							if (!parent1.contains(winHandle)) {
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
					//int size1= size-1;
					System.out.println("Request for Pending  " + size);
					
					
					for (int j = 0; j<=3 ; j++) {   ///  j<=size-1
						
						Thread.sleep(10000);
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
					
					
				}
				driver.switchTo().defaultContent();
				Thread.sleep(5000);
			}
		}
		
		
		@Test
		public void profileViewRequest() throws Exception {
			
			   Inbox i = new Inbox(driver);
			   ShortList s = new ShortList(driver);
			   ViewProfileScroll v = new ViewProfileScroll(driver);
			   Horoscope h = new Horoscope(driver);
			   WebDriverWait wait = new WebDriverWait(driver, 60);
			   com.pom.ProfileViewNotContacted p = new com.pom.ProfileViewNotContacted(driver);
			   Actions acc = new Actions(driver);
			   
			   
			   ///////////////////////////////////////////////////////////////////////////
			   
			   acc.moveToElement(p.getMy_home()).build().perform();
				Thread.sleep(1000);
				try {
					driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]"));
				} catch (Exception e) {
					e.getMessage();
				}
				
				acc.moveToElement(p.getProfile_viewed_not_contacted()).build().perform();
				Base.click(p.getProfile_viewed_not_contacted());
				Thread.sleep(5000);   
			
			
			
	 /*        Thread.sleep(3000);
			 
			 Base.click(v.getContact_radio_btn());
			 
			 Base.click(v.getView_radio_btn());
			 
			 Base.click(v.getShortlist_radio_button());
			 
			 Base.click(v.getBlock_radio_btn());
			 
			 Base.click(v.getIgnore_radio_btn());
			 
			 Base.click(v.getDnt_show_submit());  */
			 
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
			//int size1= size-1;
			System.out.println("Request for Pending  " + size);
			
			
			for (int j = 0; j<=size-1; j++) {  //j<size-1
				
				Thread.sleep(10000);
		      request.get(j).click();
		      try {
		      Thread.sleep(3000);
		      driver.findElement(By.id("accept_close")).click();
		      } catch (Exception e) {
				e.getMessage();
			}
			}
			
			System.out.println("All Request Sent Succesfully ");
			 Thread.sleep(3000); 
		}
		
		
		

}
