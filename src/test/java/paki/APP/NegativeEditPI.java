package paki.APP;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class NegativeEditPI extends BaseTest1 {
	public String reportDirectory = "reports";
	public String reportFormat = "xml";
	public String testName = "Untitled";
	public AndroidDriver<AndroidElement> driver = null;

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
	    
		 NegativeEditPIPom p = new NegativeEditPIPom(driver);
			Matches_Pom p1 = new Matches_Pom(driver);
			BaseTest b = new BaseTest();
			Login l = new Login(driver);
			Login_Pom l1 = new Login_Pom(driver);
			for (int i = 0; i <= 0; i++) {
				try {
					 
					 
					Thread.sleep(5000);
					BaseTest.click(l1.getLogin_skip_btn());
					Thread.sleep(2000);
					BaseTest.click(l1.getLogin_btn());

					// BaseTest.click(l.getEnter_Matrid());
					Thread.sleep(2000);
					BaseTest.typeData(l1.getEnter_Matrid(), "pak852749");
					Thread.sleep(2000);
					BaseTest.typeData(l1.getEnter_passwrd(), "cbstest");
					Thread.sleep(2000);
					BaseTest.click(l1.getEnter_Login());

					// BaseTest.login123("SOU143878", "cbstest");
					System.out.println("login succesffully completed.....");
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
			Thread.sleep(5000);
			Thread.sleep(5000);

			BaseTest.click(p.getMain_menu());
			Thread.sleep(5000);
			BaseTest.click(p.getEdit_Profile_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getEdit_Number_btn());
			Thread.sleep(5000);
			BaseTest.clear(p.getEdit_Number_txt());
			Thread.sleep(5000);
			BaseTest.typeData(p.getEdit_Number_txt(), "8098898244");
			Thread.sleep(5000);
			// b.click(p.getEdit_Number_txt_submit());
			BaseTest.click(p1.getBack_btn());

			 

			// basic details Edit//
			
			Thread.sleep(5000);
			driver.swipe(0, 600, 0, 0, 1000);

			Thread.sleep(5000);
			BaseTest.click(p.getBasic_details_edit_btn());
			Thread.sleep(5000);
			// edit profile//
			BaseTest.click(p.getEdit_Profile_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getProfile_created());
			Thread.sleep(5000);
			// name//
			BaseTest.click(p.getName_field());
			Thread.sleep(5000);
			BaseTest.typeData(p.getName_field(), "siddhika");
			Thread.sleep(5000);
			// height//
			BaseTest.click(p.getHeight_btn());
			Thread.sleep(5000);
			driver.hideKeyboard();
			Thread.sleep(5000);
			BaseTest.click(p.getHeight_Value());
			Thread.sleep(5000);
			// weight//
			BaseTest.click(p.getWeight_btn());
			Thread.sleep(5000);
			driver.hideKeyboard();
			Thread.sleep(5000);
			BaseTest.click(p.getWeight_value());
			Thread.sleep(5000);
			// Bodytype//

			BaseTest.click(p.getBody_type_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getBody_type_Value());
			Thread.sleep(5000);
			// complexion//
			BaseTest.click(p.getComplexion_type_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getComplexion_type_value());
			Thread.sleep(5000);
			// physical type//
			BaseTest.click(p.getPhysical_type_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getPhysical_type_value());
			Thread.sleep(5000);
			// languages//
			BaseTest.click(p.getLanguages_known_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getLanguages_known_Value());
			Thread.sleep(5000);
			BaseTest.click(p.getSelect_ok_btn());
			// save button//
			Thread.sleep(5000);
			BaseTest.click(p.getSave_btn());
			System.out.println("Basic details edited");
			Thread.sleep(10000);
			// Thread.sleep(5000);
			driver.swipe(0, 800, 0, 0, 1000);

			// **********Religious**********/
			Thread.sleep(5000);
			BaseTest.click(p.getReligious_detilas_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getStar_btn());
			// Thread.sleep(5000);
			// b.typeData(p.getStar_value_btn(),
			// BaseTest.readValueFromExcelSheet().get(1).get("star"));
			Thread.sleep(5000);
			BaseTest.click(p.getStar_select_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getRasi_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getRasi_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getGothram_btn());
			Thread.sleep(5000);
			BaseTest.typeData(p.getGothram_btn(), "baby");
			Thread.sleep(5000);
			if (p.getDosham_btn().isDisplayed()) {
				Thread.sleep(5000);
				BaseTest.click(p.getDosham_btn());
			} else {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='edit_txt_dhosam_value']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@text='Yes']")).click();
			}
			BaseTest.click(p.getDosham_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getDosham_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSave_btn());
			System.out.println("Religious information edited ");
			Thread.sleep(5000);
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			// ****************professional**************///
			Thread.sleep(5000);
			BaseTest.click(p.getProfessional_info_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getEducation_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getEducation_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getEducation_Detail_btn());
			Thread.sleep(5000);
			BaseTest.typeData(p.getEducation_Detail_btn(), "Information Technology");
			Thread.sleep(5000);
			BaseTest.click(p.getCollege_Detail_btn());
			Thread.sleep(5000);
			BaseTest.typeData(p.getCollege_Detail_btn(), "engineering college");
			Thread.sleep(5000);
			BaseTest.click(p.getEmployed_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getEmployed_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getOccupation_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getOccupation_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getOccupation_detail_btn());
			Thread.sleep(5000);
			BaseTest.typeData(p.getOccupation_detail_btn(), "Devops");
			Thread.sleep(5000);
			// driver.findElement(By.xpath("//*[@id='back']")).click();
			driver.hideKeyboard();
			Thread.sleep(5000);
			BaseTest.click(p.getCurrency_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getReg_search_btn());
			Thread.sleep(5000);
			BaseTest.typeData(p.getReg_search_btn(), "Pakistan");
			Thread.sleep(5000);
			BaseTest.click(p.getIndia_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getAnnual_income());
			Thread.sleep(5000);
			BaseTest.click(p.getAnnual_Income_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSave_btn());
			System.out.println("Professional information edited");
			Thread.sleep(5000);
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			// **********location************/
			Thread.sleep(5000);
			BaseTest.click(p.getLocation_edit_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getCountry_living_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getCountry_living_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getResiding_state_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getResiding_sate_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getResiding_city_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getResiding_city_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getCitizen_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getCitizen_Value_btn());

			Thread.sleep(5000);
			BaseTest.click(p.getSave_btn());
			System.out.println("Location edited ");
			Thread.sleep(5000);
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			// ***********Faamily**************//

			driver.swipe(0, 800, 0, 0, 1000);
			Thread.sleep(5000);
			BaseTest.click(p.getFamily_info_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getFamily_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getFamily_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getFamily_type_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getFamily_type_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getFamily_status_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getFamily_staus_Value_btn());
			// b.click(p.getFamily_Value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getFather_occupation_Value_btn());
			Thread.sleep(5000);
			BaseTest.typeData(p.getFather_occupation_Value_btn(), "real Estate");
			Thread.sleep(5000);
			BaseTest.click(p.getMother_occupation_Value_btn());
			Thread.sleep(5000);
			BaseTest.typeData(p.getMother_occupation_Value_btn(), "housewife");
			Thread.sleep(5000);
			driver.hideKeyboard();
			// b.click(p.getAncstor_btn());
			// Thread.sleep(5000);
			// b.typeData(p.getAncstor_btn(), "happy");
			// Thread.sleep(5000);
			// driver.findElement(By.id("back")).click();
			Thread.sleep(5000);
			BaseTest.click(p.getBrother_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getBrother_Value_btn());
			Thread.sleep(10000);
			BaseTest.click(p.getBrother_married_btn());
			Thread.sleep(10000);
			BaseTest.click(p.getBrother_married_value_btn());
			Thread.sleep(10000);
			BaseTest.click(p.getSister_btn());
			Thread.sleep(10000);
			BaseTest.click(p.getSister_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSister_married_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSister_married_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSave_btn());
			System.out.println("family details edited");
			Thread.sleep(10000);
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			// driver.swipe(0, 800, 0, 0, 1000);
			// **************habits*************//
			driver.swipe(0, 800, 0, 0, 1000);
			Thread.sleep(5000);
			BaseTest.click(p.getHabits_edit_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getEating_habits_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getEating_habits_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getDrinking_habits_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getDrinking_habits_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSmoking_habits_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSmoking_habits_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSave_btn());
			System.out.println("habits details edited");
			Thread.sleep(5000);
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			// ************lifeStyle*************//
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			Thread.sleep(5000);
			BaseTest.click(p.getLifestyle_edit_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getHobbies_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getHobbies_value_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSelect_ok_btn());
			Thread.sleep(5000);
			BaseTest.click(p.getSave_btn());
			System.out.println("lifestyle details edited");
			Thread.sleep(5000);
			BaseTest.click(driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")));
			Thread.sleep(5000);
			driver.swipe(0, 800, 0, 0, 1000);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='accountsLayout']")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='logoutLayout']")).click();

		}
	}

 
