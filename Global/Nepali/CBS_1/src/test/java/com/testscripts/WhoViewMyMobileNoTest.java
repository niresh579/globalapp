package com.testscripts;

import java.util.List;

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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.IntermediatePages;
import com.pom.LoginPage;
import com.pom.Logout;
import com.pom.URL;
import com.pom.WhoShortListMe;

public class WhoViewMyMobileNoTest extends Base {
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void startUp() {


		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
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
		String un=Base.getexcel1("login", 1, 0);
		String pwd=Base.getexcel1("login", 1, 1);
	    LoginPage.getLogin(driver, un, pwd);
	    Thread.sleep(2000);
	    IntermediatePages.intermediatePagesClose(driver);
	    Thread.sleep(7000);
	    acc.moveToElement(w.getMy_home()).build().perform();
		Thread.sleep(2000);
		acc.moveToElement(w.getMy_home()).build().perform();
		acc.moveToElement(w.getWho_view_my_mble_no()).build().perform();
		Thread.sleep(1000);
		Base.click(w.getWho_view_my_mble_no());
		Thread.sleep(3000);
		 String Mobile_View_count = w.getMble_no_view_count().getText();
		 System.out.println("Mobile view count : "+Mobile_View_count);
		 Integer count = Integer.parseInt(Mobile_View_count);
		 System.out.println(count);
		 
		 int Count1 = (count/10);
		 System.out.println(Count1);
		 int count2 = (int) Math.ceil(Count1);
		 System.out.println(count2);

			 if (count>10) {
				 
				 List<WebElement> Matri = driver.findElements(By.xpath("//a[@class='clr6 boldtxt']"));
				 
				 for (int i = 0; i < count2; i++) {
					 
					 for (int j = 0; j < Matri.size(); j++) {
						
						 List<WebElement> name = driver.findElements(By.xpath("//a[@class='clr1 font16 boldtxt padr8']"));
					 String ID = Matri.get(j).getText();
					 String Name = name.get(j).getText();
					 System.out.println("The Mobile Numbered Viewed by - "+ID+" : "+Name);
					 }
				
				 for (int k = 0; k < 10; k++) {
			
				 js.executeScript("window.scrollBy(0,350)");
				 
				 }
				 Thread.sleep(3000);
				 try {
					Base.click(w.getMobile_view_next());
					Thread.sleep(1000);
					Base.click(driver.findElement(By.id("chatbuddylistwin")));
					
					Base.click(w.getMobile_view_next());
				} catch (Exception e) {
					
				}
				 } 
				
			}
			             ////////////    Mobile Viewed By ME   ////////////////
			 
			 Thread.sleep(3000);
		     Base.click(w.getMble_no_viewed_by_me());
		     
		     
		     
			 String Mobile_View_by_me_count = w.getMble_no_view_count().getText();
			 System.out.println(Mobile_View_by_me_count);
			 
			 Integer count1 = Integer.parseInt(Mobile_View_by_me_count);
			 System.out.println(count1);
			 
			 int Count11 = (count1/10);
			 System.out.println(Count11);
			 int count22 = (int) Math.ceil(Count11);
			 System.out.println(count22);
			 
			 if (count1>10) {
				 
				 List<WebElement> Matri = driver.findElements(By.xpath("//a[@class='clr6 boldtxt']"));
				 
				 for (int i = 0; i < count22; i++) {
					 
					 for (int j = 0; j < Matri.size(); j++) {
						
						 List<WebElement> name = driver.findElements(By.xpath("//a[@class='clr1 font16 boldtxt padr8']"));
					 String ID = Matri.get(j).getText();
					 String Name = name.get(j).getText();
					 System.out.println("The Mobile Numbered Viewed by - "+ID+" : "+Name);
					 }
				
				 for (int k = 0; k < 10; k++) {
			
					 Thread.sleep(3000);
				 js.executeScript("window.scrollBy(0,350)");
				 
				 }
				 Thread.sleep(3000);
				 try {
					
					Thread.sleep(2000);
					Base.click(w.getMobile_view_next());
				} catch (Exception e) {
					
				}
				 Thread.sleep(3000);
				 try {
					 
					Base.click(w.getMobile_view_next1());
				} catch (Exception e) {
					
				}
				 } 
				
			}
			
			 
	}
	@AfterTest
	public void configAfterTest() throws Throwable {
		Logout.getLogout(driver);
	}
	

}
