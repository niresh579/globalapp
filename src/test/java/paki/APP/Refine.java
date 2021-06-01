package paki.APP;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

public class Refine {
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
	public void testUntitled() throws InterruptedException {
		RefinePOM p1 = new RefinePOM(driver);
		Matches_Pom p = new Matches_Pom(driver);
		BaseTest b = new BaseTest();
		Login_Pom l = new Login_Pom(driver);
		 
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
		Thread.sleep(10000);

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
		Thread.sleep(5000);
		b.click(p.getMatches());
		Thread.sleep(5000);
		b.click(driver.findElement(By.xpath("//*[@id='fabes']")));
		Thread.sleep(15000);
		// List<AndroidElement> employee_details =
		// driver.findElements(By.xpath("(//*[@id='refine_listView']/*/*[@id='refine_adapter_checkBox'])"));
		// Thread.sleep(5000);
		driver.swipe(0, 600, 0, 0, 2000);
		// ***************Employed in**************//
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]] and ./*[@id='txt_title']])[1]")));
		Thread.sleep(5000);
		List<AndroidElement> employee_details = driver.findElements(By.xpath("//*[@id='refine_adapter_checkBox']"));
		Thread.sleep(5000);

		// Thread.sleep(5000);
		employee_details.get(new Random().nextInt(employee_details.size() - 2)).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());

		String r2 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*/*[@id='txt_title' and @height>0 and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]]]])[1]"))
				.getText();
		System.out.println(r2);
		Thread.sleep(15000);
		// *************citizenship*****************//
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]] and ./*[@id='txt_title']])[2]")));
		Thread.sleep(5000);
		employee_details.get(new Random().nextInt(employee_details.size())).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r3 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*/*[@id='txt_title' and @height>0 and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]]]])[2]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r3);

		Thread.sleep(15000);
		// ******** eating habits**********//
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]] and ./*[@id='txt_title']])[3]")));
		Thread.sleep(5000);
		employee_details.get(new Random().nextInt(employee_details.size() - 2)).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r4 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*/*[@id='txt_title' and @height>0 and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]]]])[3]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r4);
		Thread.sleep(15000);
		// driver.swipe(0, 800, 0, 0, 2000);
		// ***************drinking habits*************//
		Thread.sleep(15000);
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]] and ./*[@id='txt_title']])[4]")));
		Thread.sleep(5000);
		employee_details.get(new Random().nextInt(employee_details.size() - 2)).click();
		Thread.sleep(15000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r5 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*/*[@id='txt_title' and @height>0 and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]]]])[4]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r5);
		// *************smoking habits***************//
		Thread.sleep(15000);
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]] and ./*[@id='txt_title']])[5]")));
		Thread.sleep(15000);
		employee_details.get(new Random().nextInt(employee_details.size() - 2)).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r6 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*/*[@id='txt_title' and @height>0 and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]]]])[5]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r6);
		// ****************physical status**********//
		Thread.sleep(15000);
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]] and ./*[@id='txt_title']])[6]")));
		Thread.sleep(15000);
		employee_details.get(new Random().nextInt(employee_details.size() - 3)).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r7 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*/*[@id='txt_title' and @height>0 and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]]]])[6]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r7);
		// *****************complexion**************//
		Thread.sleep(15000);
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]] and ./*[@id='txt_title']])[7]")));
		Thread.sleep(15000);
		employee_details.get(new Random().nextInt(employee_details.size() - 4)).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r8 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*/*[@id='txt_title' and @height>0 and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]]]])[7]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r8);
		// Thread.sleep(5000);

		// *********************Body type****************//
		Thread.sleep(15000);
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./*[@id='txt_title']])[8]")));
		Thread.sleep(15000);
		employee_details.get(new Random().nextInt(employee_details.size() - 3)).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r9 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./*[@id='txt_title']])[8]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r9);
		// *********************family value******************//
		driver.swipe(0, 800, 0, 0, 2000);
		Thread.sleep(15000);
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./*[@id='txt_title']])[5]")));
		Thread.sleep(15000);
		employee_details.get(new Random().nextInt(employee_details.size() - 3)).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r10 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./*[@id='txt_title']])[5]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r10);
		// ******************family type*********************//
		Thread.sleep(15000);
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./*[@id='txt_title']])[6]")));
		Thread.sleep(15000);
		employee_details.get(new Random().nextInt(employee_details.size() - 4)).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r11 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./*[@id='txt_title']])[6]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r11);
		// ************************family status********************//
		Thread.sleep(5000);
		b.click(driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./*[@id='txt_title']])[7]")));
		Thread.sleep(5000);
		employee_details.get(new Random().nextInt(employee_details.size() - 4)).click();
		Thread.sleep(5000);
		b.click(p1.getSelect_ok_btn());
		Thread.sleep(5000);
		String r12 = driver.findElement(By.xpath(
				"(//*[@id='recy_refine']/*/*/*[@class='android.widget.RelativeLayout' and @height>0 and ./*[@id='txt_title']])[7]"))
				.getText();
		Thread.sleep(5000);
		System.out.println(r12);

		Thread.sleep(5000);
		b.click(driver.findElement(By.xpath("//*[@id='btn_apply']")));

	}}

	 