package com.testscripts;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.IntermediatePages;
import com.pom.LoginPage;
import com.pom.Logout;
import com.pom.SortScroll;
import com.pom.URL;
import com.pom.WhoViewBanner;
import com.relevantcodes.extentreports.model.ITest;

public class WhoViewedMyProfileTest extends Base{
	
	WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}
	
	@Test (enabled=true)
	public void bannerContTest1() throws Throwable {
		WhoViewBanner w = new WhoViewBanner(driver);
		Actions acc = new Actions(driver);
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
	     //........navigate to My home page...........
		 acc.moveToElement(w.getMy_home()).build().perform();
		 Thread.sleep(2000);

		 Base.click(w.getMy_home());
		System.out.println("clicked on my home");
		
		try {
			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
		} catch (Exception e) {
			e.getMessage();
		}
		
		Thread.sleep(5000);
		String count = w.getViewed_my_profile_banner_count().getText();
		System.out.println("Viewed my profile Count : "+count);
		Integer Count = Integer.parseInt(count);
        System.out.println("Int Count : " + Count);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", w.getViewed_my_profile_banner_count());
        Thread.sleep(2000);
        
        ///////////////    Window Handle  ///////
        String parent = driver.getWindowHandle();
        
        Set<String> child = driver.getWindowHandles();
        for (String handle : child) {
			if (!parent.contains(handle)) {
				Thread.sleep(2000);
				driver.switchTo().window(handle);
				
			}
        	
        	
		}
        
        String count1 = w.getViewed_my_profile_count().getText();
        System.out.println(count1);
        
        Integer Count1 = Integer.parseInt(count1);
        System.out.println(Count1);
        Thread.sleep(2000);
        
        
        
        if (Count.equals(Count1)) {
        	
        	System.out.println("Count Matched");
			
		} else {

			System.out.println("Count not Matched");
			
		}
        driver.close();
        Thread.sleep(1000);
	    driver.switchTo().window(parent);
 
           System.out.println("Who Viewed My Profile Count Test Completed Successfully");
           
	}
	
     @Test(enabled=false)
     public void whoViewedMeScrollTest2() throws InterruptedException, Throwable {
 		WhoViewBanner w = new WhoViewBanner(driver);
 		Actions acc = new Actions(driver);
 		JavascriptExecutor js  =  (JavascriptExecutor)driver;
 		Thread.sleep(3000);
		driver.get(URL.getURL());
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String un=Base.getexcel1("login", 1, 0);
		String pwd=Base.getexcel1("login", 1, 1);
	    LoginPage.getLogin(driver, un, pwd);
	    Thread.sleep(2000);
	    System.out.println("Handling Intermeiate Pages");
	    IntermediatePages.intermediatePagesClose(driver);
		Thread.sleep(2000);
		acc.moveToElement(w.getMy_home()).build().perform();
		Thread.sleep(5000);
 		Base.click(w.getMy_home());
 		try {
			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
		} catch (Exception e) {
			e.getMessage();
		}
 		
         Thread.sleep(5000);
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", w.getViewed_my_profile_banner_count());
         Thread.sleep(2000);
         
         ///////////////    Window Handle  ///////
         String parent = driver.getWindowHandle();
         
         Set<String> child = driver.getWindowHandles();
         for (String handle : child) {
 			if (!parent.contains(handle)) {
 				Thread.sleep(2000);
 				driver.switchTo().window(handle);
 			}
	
 		}
         
    	 Thread.sleep(5000);  

		 String a = w.getViewed_my_profile_count().getText();
		 Integer profile_count =Integer.parseInt(a);
		  int page_cou = (profile_count/10);
		  System.out.println(page_cou);
		  
		  for (int m = 0; m <=3; m++) {
			  
			  for (int j = 0; j <=12; j++) {
				  Thread.sleep(1000);
					js.executeScript("window.scrollBy(0,350)"); 
					//System.out.println("The Scroll Completed are : "+j);
			}
	
			  Thread.sleep(3000);
	try {		  
			  Base.click(driver.findElement(By.xpath("//*[@id=\"paginationBottom\"]/span[2]")));
			  Thread.sleep(2000);
	} catch (Exception e) {
		System.out.println("No Next Button");
	}  
			
		}
	driver.close();
		  Thread.sleep(1000);
         driver.switchTo().window(parent);
         
 	}
     
     
     
     @Test(enabled=false)
     public void viewProfileRequest3() throws Throwable {	
  		WhoViewBanner w = new WhoViewBanner(driver);
  		Actions acc = new Actions(driver);
  		driver.get(URL.getURL());
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String un=Base.getexcel1("login", 1, 0);
		String pwd=Base.getexcel1("login", 1, 1);
	    LoginPage.getLogin(driver, un, pwd);
	    Thread.sleep(2000);
	    System.out.println("Handling Intermeiate Pages");
	    IntermediatePages.intermediatePagesClose(driver);
		Thread.sleep(3000);
		acc.moveToElement(w.getMy_home()).build().perform();
  		Base.click(w.getMy_home());
  		try {
			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]"));
		} catch (Exception e) {
			e.getMessage();
		}
  		
          Thread.sleep(5000);
          JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].click();", w.getViewed_my_profile_banner_count());
          Thread.sleep(2000);
          
          ///////////////    Window Handle  ///////
          String parent = driver.getWindowHandle();
          
          Set<String> child = driver.getWindowHandles();
          for (String handle : child) {
  			if (!parent.contains(handle)) {
  				Thread.sleep(2000);
  				driver.switchTo().window(handle);
  			}
 	
  		}
          
     	 Thread.sleep(5000);  
     	 Base.click(w.getView_profile_click());
     	 Thread.sleep(3000);
     //	 driver.close();
     	 
     	
		Set<String> child1 = driver.getWindowHandles();
		for (String handle1 : child1) {
			if (!child.contains(handle1)) {
				Thread.sleep(2000);
				driver.switchTo().window(handle1);				
			}
			
		}
		
		List<WebElement> request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
		System.out.println(request.size());
		
		for (int j = 0; j<=request.size()-1; j++) {
			
			Thread.sleep(5000);
	      request.get(j).click();
	      try {
	      Thread.sleep(3000);
	      driver.findElement(By.id("accept_close")).click();
	      } catch (Exception e) {
			e.getMessage();
		}
		}
		
		System.out.println("All Request Sent Succesfully ");
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
	}
     
     
     
     @Test(enabled=false)
     public void WhoViewMyProfileShortlist4() throws Throwable {
		
    		WhoViewBanner w = new WhoViewBanner(driver);
      		Actions acc = new Actions(driver);
      		Thread.sleep(3000);
    		
    		driver.get(URL.getURL());
    		Thread.sleep(3000);
    		driver.manage().window().maximize();
    		String un=Base.getexcel1("login", 1, 0);
    		String pwd=Base.getexcel1("login", 1, 1);
    	    LoginPage.getLogin(driver, un, pwd);
    	    Thread.sleep(2000);
    	    System.out.println("Handling Intermeiate Pages");
    	    IntermediatePages.intermediatePagesClose(driver);
      		
      		//////////   
      		Thread.sleep(4000);
      		acc.moveToElement(w.getMy_home()).build().perform();
      		Base.click(w.getMy_home());
      		System.out.println("clicked on my home");
      		try {
    			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
    		} catch (Exception e) {
    			e.getMessage();
    		}
      		
              Thread.sleep(5000);
              JavascriptExecutor executor = (JavascriptExecutor)driver;
              executor.executeScript("arguments[0].click();", w.getViewed_my_profile_banner_count());
              System.out.println("clicked on viewed my profile banner");
              Thread.sleep(2000);
              
              ///////////////    Window Handle  ///////
              String parent = driver.getWindowHandle();
              
              Set<String> child = driver.getWindowHandles();
              for (String handle : child) {
      			if (!parent.contains(handle)) {
      				Thread.sleep(2000);
      				driver.switchTo().window(handle);
      			}
     	
      		}
              Thread.sleep(2000);
              WebElement shrtlist =driver.findElement(By.xpath("(//*[contains(@id,'shortlist_')])[1]"));
              shrtlist.click();
              System.out.println("profile shortlisted");
              Thread.sleep(2000);
          try {    
              Base.click(w.getShorlisted_popup());
          } catch (Exception e) {
			e.getMessage();
		}
	}  
    @AfterTest
 	public void configAfterTest() throws Throwable {
 		Logout.getLogout(driver);
 	}
     
}
