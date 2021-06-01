package paki.APP;

//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;

public class view_Profile {
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
        dc.setCapability(MobileCapabilityType.UDID, "32002b32ee5b451f");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.community.matrimony");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.domaininstance.ui.activities.Splash");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);

	}

	@Test
	public void testUntitled() throws InterruptedException {

		Login_Pom l = new Login_Pom(driver);
		ViewProfilePOM d = new ViewProfilePOM(driver);
		for (int i = 0; i <= 0; i++) {
			try {
				Thread.sleep(2000);

				BaseTest.click(l.getLogin_skip_btn());
				Thread.sleep(2000);
				BaseTest.click(l.getLogin_btn());

				// BaseTest.click(l.getEnter_Matrid());
				Thread.sleep(2000);
				BaseTest.typeData(l.getEnter_Matrid(), "PAK871219");
				Thread.sleep(2000);
				BaseTest.typeData(l.getEnter_passwrd(), "cbstest");
				Thread.sleep(2000);
				BaseTest.click(l.getEnter_Login());

			} catch (Exception e) {
				System.out.println("Already Login.................");
			}
		}
		try {

			Thread.sleep(4000);
			BaseTest.click(l.getQuickrespnse_clse_btn());
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
			BaseTest.click(l.getInter_close());
			System.out.println("intermediate page Handled......");

		} catch (Exception e) {
			System.out.println("no intermediate page displayed.....");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='JUST JOINED']")).click();
		for (int i = 1; i <=1; i++) {
		Thread.sleep(5000);
		String profile_des = driver.findElement(By.xpath("(//*[@resource-id='com.community.matrimony:id/profileDesc'])["+i+"]")).getText();
		System.out.println(profile_des);

		/*
		 * List<AndroidElement> mat = driver.findElements(By.xpath(
		 * "//*[@resource-id='com.community.matrimony:id/profileDesc']"));
		 * 
		 * for (int j = 0; j <= mat.size(); j++) {
		 * 
		 * System.out.println(mat.get(j).getText());
		 * 
		 * }
		 */

		String[] s1 = profile_des.split(",");

		String age1 = s1[0].toString();
		String agee = age1.trim();
		System.out.println(agee);
		Thread.sleep(2000);
		
			
		
		driver.findElement(By.xpath("(//*[@resource-id='com.community.matrimony:id/profileDesc'])["+i+"]")).click();
		Thread.sleep(5000);
		driver.swipe(0, 1200, 0, 0, 2000);
		String vp = driver.findElement(By.xpath(
				"((//*[@id='basicdetail_dynamicinfo']/*[@class='android.widget.LinearLayout'])[2]/*[@text and @class='android.widget.TextView' and @width>0 and @height>0])[3]"))
				.getText();
		System.out.println(vp);
		if (vp.equals(agee)) {
			System.out.println("age is verified...");
		} else {
			System.out.println("age doesnt match.....");
		}

		Thread.sleep(2000);
		String age123 = s1[1].toString();

		String height = age123.trim();
		System.out.println(height);

		String vp1 = driver.findElement(By.xpath("((//*[@id='basicdetail_dynamicinfo']/*[@class='android.widget.LinearLayout'])[5]/*[@text and @class='android.widget.TextView' and @width>0 and @height>0])[3]")).getText();
		System.out.println(vp1);
		if (vp1.equals(height)) {
			System.out.println("height is verified...");
		} else {
			System.out.println("height doesnt match.....");
		}

		Thread.sleep(2000);
		String m_st = s1[2].toString();

		String ma_status = m_st.trim();
		System.out.println(ma_status);

		String vp2 = driver.findElement(By.xpath(
				"((//*[@id='basicdetail_dynamicinfo']/*[@class='android.widget.LinearLayout'])[7]/*[@text and @class='android.widget.TextView'])[3]"))
				.getText();
		System.out.println(vp2);
		if (vp2.equals(ma_status)) {
			System.out.println("marital status is verified...");
		} else {
			System.out.println("marital status doesnt match.....");
		}

		Thread.sleep(2000);
		String country = s1[3].toString();
		String country1 = country.trim();
		System.out.println(country1);
		//driver.scrollToExact("Where Does She Stay?").getText();
		driver.swipe(0, 800, 0, 0, 2000);
		driver.swipe(0, 800, 0, 0, 2000);

		String vp3 = driver.findElement(By.xpath(
				"((//*[@id='location_dynamicinfo']/*[@class='android.widget.LinearLayout'])[1]/*[@text and @class='android.widget.TextView'])[3]"))
				.getText();
		System.out.println(vp3);
		if (vp3.equals(country1)) {
			System.out.println("country status is verified...");
		} else {
			System.out.println("country status doesnt match.....");
		}

		Thread.sleep(2000);
		String occupation = s1[4].toString();
		String occupation1 = occupation.trim();
		System.out.println(occupation1);
		// driver.swipe(0, 1000, 0, 0, 2000);
		// driver.swipe(0, 800, 0, 0, 2000);

		String vp4 = driver.findElement(By.xpath(
				"((//*[@id='professionalinfo_dynamicinfo']/*[@class='android.widget.LinearLayout'])[4]/*[@text and @class='android.widget.TextView' and @width>0 and @height>0])[3]"))
				.getText();
		System.out.println(vp4);
		if (vp4.equals(occupation1)) {
			System.out.println("occupation status is verified...");
		} else {
			System.out.println("occupation status doesnt match.....");
		}
		Thread.sleep(2000);
		String education = s1[5].toString();
		String education1 = education.trim();
		System.out.println(education1);

		String vp5 = driver.findElement(By.xpath(
				"((//*[@id='professionalinfo_dynamicinfo']/*[@class='android.widget.LinearLayout'])[1]/*[@text and @class='android.widget.TextView' and @width>0 and @height>0])[3]"))
				.getText();
		System.out.println(vp5);
		if (vp5.equals(education1)) {
			System.out.println("education status is verified...");
		} else {
			System.out.println("education status doesnt match.....");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@contentDescription='Navigate up' and @width>0]")).click();

	}}

}