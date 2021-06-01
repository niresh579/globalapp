package paki.APP;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;

public class Search2 {
	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "Untitled";
	protected AndroidDriver<AndroidElement> driver = null;

	DesiredCapabilities dc = new DesiredCapabilities();

	@BeforeTest
	public void setUp() throws MalformedURLException {
		  dc.setCapability("reportDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.PakistaniMatrimony");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.domaininstance.ui.activities.Splash");
	        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);


	}

	@Test
	public void testUntitled() throws InterruptedException, AWTException {
		Login l = new Login(driver);
		Login_Pom l1 = new Login_Pom(driver);
		Search s = new Search(driver);
		for (int i = 0; i <= 0; i++) {
			try {
				Thread.sleep(2000);

				BaseTest.click(l1.getLogin_skip_btn());
				Thread.sleep(2000);
				BaseTest.click(l1.getLogin_btn());

				// BaseTest.click(l.getEnter_Matrid());
				Thread.sleep(2000);
				BaseTest.typeData(l1.getEnter_Matrid(), "PAK871219");
				Thread.sleep(2000);
				BaseTest.typeData(l1.getEnter_passwrd(), "cbstest");
				Thread.sleep(2000);
				BaseTest.click(l1.getEnter_Login());

			} catch (Exception e) {
				System.out.println("Already Login.................");
			}
		}
		try {

			Thread.sleep(4000);
			BaseTest.click(l1.getQuickrespnse_clse_btn());
			System.out.println("quick Response page Handled......");

		} catch (Exception e) {
			System.out.println("no quick response page displayed.....");
		}

		Thread.sleep(2000);
		try {

			Thread.sleep(4000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id='skip']")));
			System.out.println("Payment intermediate page Handled.....");

		} catch (Exception e) {
			System.out.println("no Payment intermediate page Handled .....");
		}

		try {

			Thread.sleep(4000);
			BaseTest.click(l1.getInter_close());
			System.out.println("intermediate page Handled......");

		} catch (Exception e) {
			System.out.println("no intermediate page displayed.....");
		}
	

		Thread.sleep(5000);
		try {
			BaseTest.click(l.getNotification_access_later());
		} catch (Exception e) {
			System.out.println("Notification handled");
		}
		try {
			Alert a = driver.switchTo().alert();
			a.dismiss();

		} catch (Exception e) {
			System.out.println("No alert To Handle");
		}

		Thread.sleep(5000);
		BaseTest.click(s.getSearch_btn());

		Thread.sleep(5000);
		List<AndroidElement> regular_search = driver.findElements(By.xpath("//*[@id='inc_filter']"));
		// (//*[@class='android.widget.RelativeLayout' and @height>0])[8]
		int size = regular_search.size();
		System.out.println("Regulare Search Size = " + size);
		
		

		for (int i = 0; i < regular_search.size(); i++) {
			Thread.sleep(5000);
			String ss = regular_search.get(i).getText();
			System.out.println("***" + ss);

		}

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='editSearchById']")).sendKeys(String.valueOf("KAP77341"));
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='editSearchById']")).click();

		Robot r = new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		try {
			if (s.getShortlist_btn().isDisplayed()) {
				Thread.sleep(5000);
				BaseTest.click(s.getShortlist_btn());
				Thread.sleep(5000);
				if (s.getShortlist_sendinterest_btn().isDisplayed()) {
					Thread.sleep(5000);
					BaseTest.click(s.getShortlist_sendinterest_btn());
				}
			}
		} catch (Exception e) {
			System.out.println("The ID Was Already Shortlisted ");
		}

		try {
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//*[@text='UPGRADE NOW' and @width>0]")).isDisplayed()) {
			Thread.sleep(5000);
			BaseTest.click(driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")));
			Thread.sleep(5000);
			BaseTest.click(driver.findElement(By.xpath("//*[@text='NOT NOW']")));

		}

		else {
			System.out.println("The Package Was Upgraded");

		}
		} catch (Exception e) {
			System.out.println("There is no Upgrade Button");
		}
		

		Thread.sleep(5000);
		List<AndroidElement> searchby_ID = driver.findElements(By.xpath("//*[@text='Request']"));
		int sss = searchby_ID.size();
		System.out.println(sss);
		int searchid = (sss / 2) - 1;
		System.out.println(searchid);
		for (int i = 0; i < searchid; i++) {

		//	Thread.sleep(5000);
		//	driver.scrollToExact("Request").click();
			
			// BaseTest.click(driver.findElement(By.xpath("//*[@text='Request']")));

		}
		
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
			driver.scrollToExact("His Religious Information");
			Thread.sleep(5000);
			if (driver.findElement(By.xpath("//*[@id='tvReqHoroscope']")).isDisplayed()) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='tvReqHoroscope']")).click();
			} else {
				System.out.println("Request Was Already Sent");

			}
		} catch (Exception e) {
			System.out.println("Religious Information Was not Displayed");
		}

		
		Thread.sleep(5000);
		try {
			driver.scrollToExact("+ More Conversations");
		} catch (Exception e) {
			System.out.println("There is no Conversations");
		}
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//*[@text='+ More Conversations']")).isDisplayed()) {

			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@text='+ More Conversations']")).click();
		}
		
		
		Thread.sleep(5000);
		List<AndroidElement> conversation = driver.findElements(By.xpath("//*[@id='txt_req_comm_title']"));
		System.out.println(conversation.size());
		Thread.sleep(5000);
		for (AndroidElement conversation_details : conversation) {
			
			
			
			Thread.sleep(5000);
			System.out.println(conversation_details.getText());

		}
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();

		Thread.sleep(5000);
		BaseTest.click(s.getMenu_btn());

		Thread.sleep(5000);
		driver.swipe(0, 800, 0, 0, 800);

		Thread.sleep(5000);
		BaseTest.click(s.getMenu_Account_settings());

		Thread.sleep(5000);
		BaseTest.click(s.getLogout());
	}
}
