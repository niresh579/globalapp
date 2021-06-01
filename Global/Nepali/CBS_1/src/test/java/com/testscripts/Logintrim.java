package com.testscripts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Horoscope;
import com.pom.Inbox;
import com.pom.NegativeloginPom;
import com.pom.NegativeregistarPom;

public class Logintrim extends Base {
	
	
	WebDriver driver;
	
	   @BeforeMethod
	   public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		

	}
	

//@Test(priority=9)
//public void loginpassword() throws InterruptedException {
//	NegativeregistarPom np = new NegativeregistarPom(driver);
//	
//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
//
//	   Thread.sleep(3000);
//	   driver.get("https://www.communitymatrimony.com");
//	   driver.manage().window().maximize();
//	   Thread.sleep(5000);
//	   click(np.getRegistar());
//	   
//	  WebElement communitsite = driver.findElement(By.id("domainName"));
//	  select_index(communitsite, 3);
//	  WebElement profilecreatedby = driver.findElement(By.id("profile"));
//	  select_index(profilecreatedby, 3);
//	  WebElement Name = driver.findElement(By.id("name"));
//	  Name.sendKeys("Nikkil");
//	  WebElement Genderclick = driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[4]/dd[2]/label[1]"));
//	  Genderclick.click();
//	  WebElement dagted = driver.findElement(By.id("dobDay"));
//	  select_index(dagted, 3);
//	  WebElement mm = driver.findElement(By.id("dobMonth"));
//	  select_index(mm, 3);
//	  WebElement yea = driver.findElement(By.id("dobYear"));
//	  select_index(yea, 3);
//	  WebElement MaritalStatus1 = driver.findElement(By.id("maritalStatus"));
//	  select_index(MaritalStatus1, 1);
//	  WebElement Mothertounge = driver.findElement(By.id("motherTongue"));
//	  select_index(Mothertounge, 1);
//	  WebElement country = driver.findElement(By.id("country"));
//	  select_index(country, 5);
//	  WebElement countrycode = driver.findElement(By.id("countryCode"));
//	  select_index(countrycode, 2);
//	  WebElement phno = driver.findElement(By.id("mobileNo"));
//	  phno.sendKeys("8984540998");
////	  WebElement pasword = driver.findElement(By.id("password"));
////	  pasword.sendKeys("cbstest");
//	  Thread.sleep(5000);
//	  click(np.getRegistarnow());
//	  driver.quit();
//}
		 @Test  
		 public void PassworddCheck() throws Throwable, IOException
		 
		 {

			    
			    	 		    	
			    	driver.get(com.pom.URL.getURL());
			    	 WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input"));
			    	 
			        System.out.print("Please enter a given  password : ");
			       // String passwordhere = Base.getexcel1("Sheet1", 0, 0);
			        String passwordhere = Base.readExcelData1("Sheet1", 0, 0);
			       // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).sendKeys(passwordhere);			     //   String passwordhere = Base.getExcelData("Sheet1", 0, 0);
			       // System.out.print("Please re-enter the password to confirm : ");
			        String confirmhere = Base.readExcelData1("Sheet1", 0, 0);

			        List<String> errorList = new ArrayList<String>();

			        while (!isValid(passwordhere, confirmhere, errorList)) {
			            System.out.println("The password entered here  is invalid");
			            for (String error : errorList) {
			                System.out.println(error);
			            }

			            System.out.print("Please enter a given  password : ");
			            passwordhere = Base.readExcelData1("Sheet1", 0, 0);
			            System.out.print("Please re-enter the password to confirm : ");
			            confirmhere = Base.readExcelData1("Sheet1", 0, 0);
			            
			        }
			        System.out.println("your password is: " + passwordhere);

			    }

			   @Test public boolean isValid(String passwordhere, String confirmhere, List<String> errorList) {

			        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
			        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
			        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
			        Pattern digitCasePatten = Pattern.compile("[0-9 ]");
			        errorList.clear();

			        boolean flag=true;

			        if (!passwordhere.equals(confirmhere)) {
			            errorList.add("password and confirm password does not match");
			            flag=false;
			        }
			        if (passwordhere.length() < 6) {
			            errorList.add("Password lenght must have alleast 8 character !!");
			            flag=false;
			        }
			        if (specailCharPatten.matcher(passwordhere).find()) {
			            errorList.add("Password must have atleast one specail character !!");
			            flag=false;
			        }
			        if (UpperCasePatten.matcher(passwordhere).find()) {
			            errorList.add("Password must have atleast one uppercase character !!");
			            flag=false;
			        }
			        if (lowerCasePatten.matcher(passwordhere).find()) {
			            errorList.add("Password must have atleast one lowercase character !!");
			            flag=false;
			        }
			        if (digitCasePatten.matcher(passwordhere).find()) {
			            errorList.add("Password must have atleast one digit character !!");
			            flag=false;
			        }

			        return flag;

			    }

			
		   }

	   	   
