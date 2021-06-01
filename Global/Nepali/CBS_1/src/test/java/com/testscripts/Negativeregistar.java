package com.testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Horoscope;
import com.pom.Inbox;
import com.pom.NegativeloginPom;
import com.pom.NegativeregistarPom;

public class Negativeregistar extends Base {
	
	
	WebDriver driver;
	
	   @BeforeMethod
	   public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
				

//	}
//	   
//	   @Test(priority=1)
//	   public void CommunitySites() throws InterruptedException {
//		NegativeregistarPom np = new NegativeregistarPom(driver);
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//		   Thread.sleep(3000);
//		   driver.get("https://www.communitymatrimony.com");
//		   driver.manage().window().maximize();
//		   Thread.sleep(5000);
//		   click(np.getRegistar());
//		  // WebElement communitsite = driver.findElement(By.id("domainName"));
//		  // select_index(communitsite, 3);
//		   
//		   //System.out.println(Profilecreatedbyerrortext);
//		   click(np.getRegistarnow());
//		   WebElement Profilecreatedbyerror = driver.findElement(By.xpath("//span[text()='Please select the community site']"));
//		   String Profilecreatedbyerrortext = Profilecreatedbyerror.getText();
//		   Thread.sleep(5000);
//		   System.out.println(Profilecreatedbyerrortext);
//		   driver.quit();
//	   
	   }	   
//	   @Test(priority=2)
//	   public void Profilecreatedby() throws InterruptedException {
//		NegativeregistarPom np = new NegativeregistarPom(driver);
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//		   Thread.sleep(3000);
//		   driver.get("https://www.communitymatrimony.com");
//		   driver.manage().window().maximize();
//		   Thread.sleep(5000);
//		   click(np.getRegistar());
//		  WebElement communitsite = driver.findElement(By.id("domainName"));
//		  select_index(communitsite, 3);
//		   
//		   //System.out.println(Profilecreatedbyerrortext);
//		   click(np.getRegistarnow());
//		   WebElement Pleaseselecttheprofilecreatedby = driver.findElement(By.xpath("//span[text()='Please select the profile created by']"));
//		   String Pleaseselecttheprofilecreatedbytext = Pleaseselecttheprofilecreatedby.getText();
//		   Thread.sleep(5000);
//		   System.out.println(Pleaseselecttheprofilecreatedbytext);
//		   driver.quit();
//	   
//	   }	   
//	   @Test(priority=3)
//	   public void Name() throws InterruptedException {
//		NegativeregistarPom np = new NegativeregistarPom(driver);
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//		   Thread.sleep(3000);
//		   driver.get("https://www.communitymatrimony.com");
//		   driver.manage().window().maximize();
//		   Thread.sleep(5000);
//		   click(np.getRegistar());
//		   
//		  WebElement communitsite = driver.findElement(By.id("domainName"));
//		  select_index(communitsite, 3);
//		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
//		  select_index(profilecreatedby, 3);
//		  click(np.getRegistarnow());
//		   WebElement Name = driver.findElement(By.xpath("//span[text()='Please enter the name']"));
//		   String Nametext = Name.getText();
//		   Thread.sleep(5000);
//		   System.out.println(Nametext);
//		   driver.quit();
//	   
//	   }	   
//	   @Test(priority=4)
//	   public void Gender() throws InterruptedException {
//		NegativeregistarPom np = new NegativeregistarPom(driver);
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//		   Thread.sleep(3000);
//		   driver.get("https://www.communitymatrimony.com");
//		   driver.manage().window().maximize();
//		   Thread.sleep(5000);
//		   click(np.getRegistar());
//		   
//		  WebElement communitsite = driver.findElement(By.id("domainName"));
//		  select_index(communitsite, 3);
//		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
//		  select_index(profilecreatedby, 3);
//		  WebElement Name = driver.findElement(By.id("name"));
//		  Name.sendKeys("Nikkil");
//		  click(np.getRegistarnow());
//		   WebElement Gender = driver.findElement(By.xpath("//span[text()='Please choose the gender']"));
//		   String Gendertext = Gender.getText();
//		   Thread.sleep(5000);
//		   System.out.println(Gendertext);
//		   driver.quit();
//	   }
//	   @Test(priority=5)
//	   public void DOB() throws InterruptedException {
//		NegativeregistarPom np = new NegativeregistarPom(driver);
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//		   Thread.sleep(3000);
//		   driver.get("https://www.communitymatrimony.com");
//		   driver.manage().window().maximize();
//		   Thread.sleep(5000);
//		   click(np.getRegistar());
//		   
//		  WebElement communitsite = driver.findElement(By.id("domainName"));
//		  select_index(communitsite, 3);
//		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
//		  select_index(profilecreatedby, 3);
//		  WebElement Name = driver.findElement(By.id("name"));
//		  Name.sendKeys("Nikkil");
//		  Thread.sleep(5000);
//		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
//		  Genderclick.click();
//		  click(np.getRegistarnow());
//
//		  
//		  click(np.getRegistarnow());
//		   WebElement dob = driver.findElement(By.xpath("//span[text()='Please select the date']"));
//		   String dobtext = dob.getText();
//		   Thread.sleep(5000);
//		   System.out.println(dobtext);
//		   
//		   driver.quit();
	 //  }
//	   @Test(priority=6)
//	   public void MaritalStatus() throws InterruptedException {
//		NegativeregistarPom np = new NegativeregistarPom(driver);
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//		   Thread.sleep(3000);
//		   driver.get("https://www.communitymatrimony.com");
//		   driver.manage().window().maximize();
//		   Thread.sleep(5000);
//		   click(np.getRegistar());
//		   
//		  WebElement communitsite = driver.findElement(By.id("domainName"));
//		  select_index(communitsite, 3);
//		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
//		  select_index(profilecreatedby, 3);
//		  WebElement Name = driver.findElement(By.id("name"));
//		  Name.sendKeys("Nikkil");
//		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
//		  Genderclick.click();
//		  WebElement dagted = driver.findElement(By.id("dobDay"));
//		  select_index(dagted, 3);
//		  WebElement mm = driver.findElement(By.id("dobMonth"));
//		  select_index(mm, 3);
//		  WebElement yea = driver.findElement(By.id("dobYear"));
//		  select_index(yea, 3);
//		  click(np.getRegistarnow());
//		   WebElement MaritalStatus = driver.findElement(By.xpath("//span[text()='Please select the marital status']"));
//		   String MaritalStatustext = MaritalStatus.getText();
//		   Thread.sleep(5000);
//		   System.out.println(MaritalStatustext);
//		   driver.quit();
	  // }
//	   @Test(priority=7)
//	   public void Mothertounge() throws InterruptedException {
//		NegativeregistarPom np = new NegativeregistarPom(driver);
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//		   Thread.sleep(3000);
//		   driver.get("https://www.communitymatrimony.com");
//		   driver.manage().window().maximize();
//		   Thread.sleep(5000);
//		   click(np.getRegistar());
//		   
//		  WebElement communitsite = driver.findElement(By.id("domainName"));
//		  select_index(communitsite, 3);
//		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
//		  select_index(profilecreatedby, 3);
//		  WebElement Name = driver.findElement(By.id("name"));
//		  Name.sendKeys("Nikkil");
//		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
//		  Genderclick.click();
//		  WebElement dagted = driver.findElement(By.id("dobDay"));
//		  select_index(dagted, 3);
//		  WebElement mm = driver.findElement(By.id("dobMonth"));
//		  select_index(mm, 3);
//		  WebElement yea = driver.findElement(By.id("dobYear"));
//		  select_index(yea, 3);
//		  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
//		  select_index(MaritalStatus1, 1);
//		  click(np.getRegistarnow());
//		   WebElement Mothertounge = driver.findElement(By.xpath("//span[text()='Please select the mother tongue']"));
//		   String Mothertoungetext = Mothertounge.getText();
//		   Thread.sleep(5000);
//		   System.out.println(Mothertoungetext);
//		   Thread.sleep(2000);
//		   driver.close();
//		   driver.quit();
//	   }
//	   @Test(priority=8)
//	   public void Mobilenumber() throws InterruptedException {
//		NegativeregistarPom np = new NegativeregistarPom(driver);
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//		   Thread.sleep(3000);
//		   driver.get("https://www.communitymatrimony.com");
//		   driver.manage().window().maximize();
//		   Thread.sleep(5000);
//		   click(np.getRegistar());
//		   
//		  WebElement communitsite = driver.findElement(By.id("domainName"));
//		  select_index(communitsite, 3);
//		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
//		  select_index(profilecreatedby, 3);
//		  WebElement Name = driver.findElement(By.id("name"));
//		  Name.sendKeys("Nikkil");
//		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
//		  Genderclick.click();
//		  WebElement dagted = driver.findElement(By.id("dobDay"));
//		  select_index(dagted, 3);
//		  WebElement mm = driver.findElement(By.id("dobMonth"));
//		  select_index(mm, 3);
//		  WebElement yea = driver.findElement(By.id("dobYear"));
//		  select_index(yea, 3);
//		  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
//		  select_index(MaritalStatus1, 1);
//		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
//		  select_index(Mothertounge, 1);
//		  click(np.getRegistarnow());
//		   WebElement mobilenumber = driver.findElement(By.xpath("//span[text()='Please enter a valid mobile number']"));
//		   String mobilenumbertext = mobilenumber.getText();
//		   Thread.sleep(5000);
//		   System.out.println(mobilenumbertext);
//		   driver.quit();
	 //  }
//	   @Test(priority=9)
//	   public void loginpassword() throws InterruptedException {
//		NegativeregistarPom np = new NegativeregistarPom(driver);
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//		   Thread.sleep(3000);
//		   driver.get("https://www.communitymatrimony.com");
//		   driver.manage().window().maximize();
//		   Thread.sleep(5000);
//		   click(np.getRegistar());
//		   
//		  WebElement communitsite = driver.findElement(By.id("domainName"));
//		  select_index(communitsite, 3);
//		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
//		  select_index(profilecreatedby, 3);
//		  WebElement Name = driver.findElement(By.id("name"));
//		  Name.sendKeys("Nikkil");
//		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
//		  Genderclick.click();
//		  WebElement dagted = driver.findElement(By.id("dobDay"));
//		  select_index(dagted, 3);
//		  WebElement mm = driver.findElement(By.id("dobMonth"));
//		  select_index(mm, 3);
//		  WebElement yea = driver.findElement(By.id("dobYear"));
//		  select_index(yea, 3);
//		  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
//		  select_index(MaritalStatus1, 1);
//		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
//		  select_index(Mothertounge, 1);
//		  WebElement country = driver.findElement(By.id("country"));
//		  select_index(country, 5);
//		  WebElement countrycode = driver.findElement(By.id("countryCode"));
//		  select_index(countrycode, 2);
//		  WebElement phno = driver.findElement(By.id("mobileNo"));
//		  phno.sendKeys("8984540998");
//		  WebElement pasword = driver.findElement(By.id("password"));
//		  pasword.sendKeys("cbstest");
//		  Thread.sleep(5000);
//		  click(np.getRegistarnow());
//		  driver.quit();
		   
	  // }
	   
	   @Test(priority=9)
	   public void Withoutcoummunity() throws InterruptedException {
		NegativeregistarPom np = new NegativeregistarPom(driver);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		   Thread.sleep(3000);
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   click(np.getRegistar());
		   
		//  WebElement communitsite = driver.findElement(By.id("domainName"));
		//  select_index(communitsite, 3);
		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
		  select_index(profilecreatedby, 3);
		  WebElement Name = driver.findElement(By.id("name"));
		  Name.sendKeys("Nikkil");
		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
		  Genderclick.click();
		  WebElement dagted = driver.findElement(By.id("dobDay"));
		  select_index(dagted, 3);
		  WebElement mm = driver.findElement(By.id("dobMonth"));
		  select_index(mm, 3);
		  WebElement yea = driver.findElement(By.id("dobYear"));
		  select_index(yea, 3);
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("mStatus1"));
			  MaritalStatus1.click();
			  } catch (Exception e) {
System.out.println("marry status raido button");		}
		  
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
			  select_index(MaritalStatus1, 1);
		} catch (Exception e) {
System.out.println("marry status dropdown");		}
		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
		  select_index(Mothertounge, 1);
		  WebElement country = driver.findElement(By.id("country"));
		  select_index(country, 5);
		  WebElement countrycode = driver.findElement(By.id("countryCode"));
		  select_index(countrycode, 2);
		  WebElement phno = driver.findElement(By.id("mobileNo"));
		  phno.sendKeys("8984540998");
		  WebElement pasword = driver.findElement(By.id("password"));
		  pasword.sendKeys("cbstest");
		  Thread.sleep(5000);
		  click(np.getRegistarnow());
		  System.out.println("Please select the community site");
		  driver.quit();
		   
	   }
	   @Test(priority=10)
	   public void withoutProfilecreatedby() throws InterruptedException {
		NegativeregistarPom np = new NegativeregistarPom(driver);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		   Thread.sleep(3000);
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   click(np.getRegistar());
		   
		  WebElement communitsite = driver.findElement(By.id("domainName"));
		  select_index(communitsite, 3);
		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
		 select_index(profilecreatedby, 3);
		 // WebElement Name = driver.findElement(By.id("name"));
		 // Name.sendKeys("Nikkil");
		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
		  Genderclick.click();
		  WebElement dagted = driver.findElement(By.id("dobDay"));
		  select_index(dagted, 3);
		  WebElement mm = driver.findElement(By.id("dobMonth"));
		  select_index(mm, 3);
		  WebElement yea = driver.findElement(By.id("dobYear"));
		  select_index(yea, 3);
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("mStatus1"));
			  MaritalStatus1.click();
			  } catch (Exception e) {
System.out.println("marry status raido button");		}
		  
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
			  select_index(MaritalStatus1, 1);
		} catch (Exception e) {
System.out.println("marry status dropdown");		}
		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
		  select_index(Mothertounge, 1);
		  WebElement country = driver.findElement(By.id("country"));
		  select_index(country, 5);
		  WebElement countrycode = driver.findElement(By.id("countryCode"));
		  select_index(countrycode, 2);
		  WebElement phno = driver.findElement(By.id("mobileNo"));
		  phno.sendKeys("8984540998");
		  WebElement pasword = driver.findElement(By.id("password"));
		  pasword.sendKeys("cbstest");
		  Thread.sleep(5000);
		  click(np.getRegistarnow());
		  System.out.println("Profile created by");
		  driver.quit();
		   
	   }
	   @Test(priority=11)
	   public void Withoutname() throws InterruptedException {
		NegativeregistarPom np = new NegativeregistarPom(driver);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		   Thread.sleep(3000);
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   click(np.getRegistar());
		   
		  WebElement communitsite = driver.findElement(By.id("domainName"));
		  select_index(communitsite, 3);
		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
		  select_index(profilecreatedby, 3);
		 // WebElement Name = driver.findElement(By.id("name"));
		//  Name.sendKeys("Nikkil");
		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
		  Genderclick.click();
		  WebElement dagted = driver.findElement(By.id("dobDay"));
		  select_index(dagted, 3);
		  WebElement mm = driver.findElement(By.id("dobMonth"));
		  select_index(mm, 3);
		  WebElement yea = driver.findElement(By.id("dobYear"));
		  select_index(yea, 3);
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("mStatus1"));
			  MaritalStatus1.click();
			  } catch (Exception e) {
System.out.println("marry status raido button");		}
		  
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
			  select_index(MaritalStatus1, 1);
		} catch (Exception e) {
System.out.println("marry status dropdown");		}
		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
		  select_index(Mothertounge, 1);
		  WebElement country = driver.findElement(By.id("country"));
		  select_index(country, 5);
		  WebElement countrycode = driver.findElement(By.id("countryCode"));
		  select_index(countrycode, 2);
		  WebElement phno = driver.findElement(By.id("mobileNo"));
		  phno.sendKeys("8984540998");
		  WebElement pasword = driver.findElement(By.id("password"));
		  pasword.sendKeys("cbstest");
		  Thread.sleep(5000);
		  click(np.getRegistarnow());
		  System.out.println("Please enter the name");
		  driver.quit();
		   
	   }
	   @Test(priority=12)
	   public void Withoutgender() throws InterruptedException {
		NegativeregistarPom np = new NegativeregistarPom(driver);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		   Thread.sleep(3000);
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   click(np.getRegistar());
		   
		  WebElement communitsite = driver.findElement(By.id("domainName"));
		  select_index(communitsite, 3);
		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
		  select_index(profilecreatedby, 3);
		  WebElement Name = driver.findElement(By.id("name"));
		  Name.sendKeys("Nikkil");
		//  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
		 // Genderclick.click();
		  WebElement dagted = driver.findElement(By.id("dobDay"));
		  select_index(dagted, 3);
		  WebElement mm = driver.findElement(By.id("dobMonth"));
		  select_index(mm, 3);
		  WebElement yea = driver.findElement(By.id("dobYear"));
		  select_index(yea, 3);
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("mStatus1"));
			  MaritalStatus1.click();
			  } catch (Exception e) {
System.out.println("marry status raido button");		}
		  
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
			  select_index(MaritalStatus1, 1);
		} catch (Exception e) {
System.out.println("marry status dropdown");		}
		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
		  select_index(Mothertounge, 1);
		  WebElement country = driver.findElement(By.id("country"));
		  select_index(country, 5);
		  WebElement countrycode = driver.findElement(By.id("countryCode"));
		  select_index(countrycode, 2);
		  WebElement phno = driver.findElement(By.id("mobileNo"));
		  phno.sendKeys("8984540998");
		  WebElement pasword = driver.findElement(By.id("password"));
		  pasword.sendKeys("cbstest");
		  Thread.sleep(5000);
		  click(np.getRegistarnow());
		  System.out.println("Please select the gender");
		  driver.quit();
		   
	   }
	   @Test(enabled=false)
	   public void Withoutdob() throws InterruptedException {
		NegativeregistarPom np = new NegativeregistarPom(driver);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		   Thread.sleep(3000);
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   click(np.getRegistar());
		   
		  WebElement communitsite = driver.findElement(By.id("domainName"));
		  select_index(communitsite, 3);
		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
		  select_index(profilecreatedby, 3);
		  WebElement Name = driver.findElement(By.id("name"));
		  Name.sendKeys("Nikkil");
		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
		  Genderclick.click();
		 // WebElement dagted = driver.findElement(By.id("dobDay"));
		 // select_index(dagted, 3);
		  WebElement mm = driver.findElement(By.id("dobMonth"));
		  select_index(mm, 3);
		  WebElement yea = driver.findElement(By.id("dobYear"));
		  select_index(yea, 3);
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("mStatus1"));
			  MaritalStatus1.click();
			  } catch (Exception e) {
System.out.println("marry status raido button");		}
		  
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
			  select_index(MaritalStatus1, 1);
		} catch (Exception e) {
System.out.println("marry status dropdown");		}
		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
		  select_index(Mothertounge, 1);
		  WebElement country = driver.findElement(By.id("country"));
		  select_index(country, 5);
		  WebElement countrycode = driver.findElement(By.id("countryCode"));
		  select_index(countrycode, 2);
		  WebElement phno = driver.findElement(By.id("mobileNo"));
		  phno.sendKeys("8984540998");
		  WebElement pasword = driver.findElement(By.id("password"));
		  pasword.sendKeys("cbstest");
		  Thread.sleep(5000);
		  click(np.getRegistarnow());
		  System.out.println("Please select the date");
		  driver.quit();
		   
	   }
	   @Test(priority=12)
	   public void Withoutmaritalstatus() throws InterruptedException {
		NegativeregistarPom np = new NegativeregistarPom(driver);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		   Thread.sleep(3000);
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   click(np.getRegistar());
		   
		  WebElement communitsite = driver.findElement(By.id("domainName"));
		  select_index(communitsite, 3);
		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
		  select_index(profilecreatedby, 3);
		  WebElement Name = driver.findElement(By.id("name"));
		  Name.sendKeys("Nikkil");
		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
		  Genderclick.click();
		  WebElement dagted = driver.findElement(By.id("dobDay"));
		  select_index(dagted, 3);
		  WebElement mm = driver.findElement(By.id("dobMonth"));
		  select_index(mm, 3);
		  WebElement yea = driver.findElement(By.id("dobYear"));
		  select_index(yea, 3);
//		  try {
//			  WebElement MaritalStatus1 = driver.findElement(By.id("mStatus1"));
//			  MaritalStatus1.click();
//			  } catch (Exception e) {
//System.out.println("marry status raido button");		}
//		  
//		  try {
//			  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
//			  select_index(MaritalStatus1, 1);
//		} catch (Exception e) 
//		  {
//System.out.println("marry status dropdown");		}
		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
		  select_index(Mothertounge, 1);
		  WebElement country = driver.findElement(By.id("country"));
		  select_index(country, 5);
		  WebElement countrycode = driver.findElement(By.id("countryCode"));
		  select_index(countrycode, 2);
		  WebElement phno = driver.findElement(By.id("mobileNo"));
		  phno.sendKeys("8984540998");
		  WebElement pasword = driver.findElement(By.id("password"));
		  pasword.sendKeys("cbstest");
		  Thread.sleep(5000);
		  click(np.getRegistarnow());
		  System.out.println("Please select the maritalstatus");
		  driver.quit();
		   
	   }
	   @Test(priority=12)
	   public void Withoutmothertounge() throws InterruptedException {
		NegativeregistarPom np = new NegativeregistarPom(driver);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		   Thread.sleep(3000);
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   click(np.getRegistar());
		   
		  WebElement communitsite = driver.findElement(By.id("domainName"));
		  select_index(communitsite, 3);
		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
		  select_index(profilecreatedby, 3);
		  WebElement Name = driver.findElement(By.id("name"));
		  Name.sendKeys("Nikkil");
		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
		  Genderclick.click();
		  WebElement dagted = driver.findElement(By.id("dobDay"));
		  select_index(dagted, 3);
		  WebElement mm = driver.findElement(By.id("dobMonth"));
		  select_index(mm, 3);
		  WebElement yea = driver.findElement(By.id("dobYear"));
		  select_index(yea, 3);
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("mStatus1"));
			  MaritalStatus1.click();
			  } catch (Exception e) {
System.out.println("marry status raido button");		}
		  
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
			  select_index(MaritalStatus1, 1);
		} catch (Exception e) 
		  {
System.out.println("marry status dropdown");		}
		 // WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
		 // select_index(Mothertounge, 1);
		  WebElement country = driver.findElement(By.id("country"));
		  select_index(country, 5);
		  WebElement countrycode = driver.findElement(By.id("countryCode"));
		  select_index(countrycode, 2);
		  WebElement phno = driver.findElement(By.id("mobileNo"));
		  phno.sendKeys("8984540998");
		  WebElement pasword = driver.findElement(By.id("password"));
		  pasword.sendKeys("cbstest");
		  Thread.sleep(5000);
		  click(np.getRegistarnow());
		  System.out.println("Please select the mothertounge");
		  driver.quit();
		   
	   }
	   @Test(priority=12)
	   public void Withoutmobilenum() throws InterruptedException {
		NegativeregistarPom np = new NegativeregistarPom(driver);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		   Thread.sleep(3000);
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   click(np.getRegistar());
		   
		  WebElement communitsite = driver.findElement(By.id("domainName"));
		  select_index(communitsite, 3);
		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
		  select_index(profilecreatedby, 3);
		  WebElement Name = driver.findElement(By.id("name"));
		  Name.sendKeys("Nikkil");
		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
		  Genderclick.click();
		  WebElement dagted = driver.findElement(By.id("dobDay"));
		  select_index(dagted, 3);
		  WebElement mm = driver.findElement(By.id("dobMonth"));
		  select_index(mm, 3);
		  WebElement yea = driver.findElement(By.id("dobYear"));
		  select_index(yea, 3);
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("mStatus1"));
			  MaritalStatus1.click();
			  } catch (Exception e) {
System.out.println("marry status raido button");		}
		  
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
			  select_index(MaritalStatus1, 1);
		} catch (Exception e) 
		  {
System.out.println("marry status dropdown");		}
		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
		  select_index(Mothertounge, 1);
		  WebElement country = driver.findElement(By.id("country"));
		  select_index(country, 5);
		  WebElement countrycode = driver.findElement(By.id("countryCode"));
		  select_index(countrycode, 2);
		 // WebElement phno = driver.findElement(By.id("mobileNo"));
		 // phno.sendKeys("8984540998");
		  WebElement pasword = driver.findElement(By.id("password"));
		  pasword.sendKeys("cbstest");
		  Thread.sleep(5000);
		  click(np.getRegistarnow());
		  System.out.println("Please enter the mobilenumber");
		  driver.quit();
		   
	   }
	   @Test(priority=13)
	   public void Withoutpassword() throws InterruptedException {
		NegativeregistarPom np = new NegativeregistarPom(driver);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		   Thread.sleep(3000);
		   driver.get("https://www.nepalimatrimony.com");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   click(np.getRegistar());
		   
		  WebElement communitsite = driver.findElement(By.id("domainName"));
		  select_index(communitsite, 3);
		  WebElement profilecreatedby = driver.findElement(By.id("profile"));
		  select_index(profilecreatedby, 3);
		  WebElement Name = driver.findElement(By.id("name"));
		  Name.sendKeys("Nikkil");
		  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
		  Genderclick.click();
		  WebElement dagted = driver.findElement(By.id("dobDay"));
		  select_index(dagted, 3);
		  WebElement mm = driver.findElement(By.id("dobMonth"));
		  select_index(mm, 3);
		  WebElement yea = driver.findElement(By.id("dobYear"));
		  select_index(yea, 3);
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("mStatus1"));
			  MaritalStatus1.click();
			  } catch (Exception e) {
System.out.println("marry status raido button");		}
		  
		  try {
			  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
			  select_index(MaritalStatus1, 1);
		} catch (Exception e) 
		  {
System.out.println("marry status dropdown");		}
		  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
		  select_index(Mothertounge, 1);
		  WebElement country = driver.findElement(By.id("country"));
		  select_index(country, 5);
		  WebElement countrycode = driver.findElement(By.id("countryCode"));
		  select_index(countrycode, 2);
		  WebElement phno = driver.findElement(By.id("mobileNo"));
		  phno.sendKeys("8984540998");
		 // WebElement pasword = driver.findElement(By.id("password"));
		 // pasword.sendKeys("cbstest");
		  Thread.sleep(5000);
		  click(np.getRegistarnow());
		  System.out.println("Please enter the password");
		  driver.quit();
		   
	   }
}
