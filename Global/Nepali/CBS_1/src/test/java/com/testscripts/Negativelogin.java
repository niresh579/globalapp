package com.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;

import org.dom4j.tree.BaseElement;
import org.openqa.selenium.Alert;
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
import com.thoughtworks.selenium.webdriven.commands.Click;


public class Negativelogin extends Base{
	private static final String Data = null;
	public static WebDriver driver; 
	String driverExecutablePath = ".//driver//chromedriver.exe";
	
	
  @BeforeMethod
  public void setUp1() throws MalformedURLException { 
	  System.setProperty("webdriver.chrome.driver", driverExecutablePath); 
	  ChromeOptions options = new ChromeOptions();
	   options.addArguments("--disable-notifications");
	    driver = new ChromeDriver(options);
	  
      
  
  }
  @Test
  public void testCase1() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   
	   Thread.sleep(3000);
	   driver.get("https://www.nepalimatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "NEP12601");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "cbstest");
	   
	   Base.click(i.getLoginbtn());
	   
	   System.out.println("Invalid user name and Valid password " + " Login not Successfull");
	   Thread.sleep(5000);
	   driver.quit();
		

}

  @Test
  public void testCase2() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   
	   Thread.sleep(3000);
	   driver.get("https://www.nepalimatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "nep140549");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "cbsteat");
	   
	   Base.click(i.getLoginbtn());
	   System.out.println(" Valid user name and Invalid password " + " Login not Successfull");
	   Thread.sleep(5000);
	   WebElement negativetest = driver.findElement(By.id("error"));
	   String negativetext = negativetest.getText();
	   System.out.println(negativetext);
	   driver.quit();
		

}

  @Test
  public void testCase3() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   
	   Thread.sleep(3000);
	   driver.get("https://www.nepalimatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "NEP10012");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "cbsteat");
	   
	   Base.click(i.getLoginbtn());
	   System.out.println(" InValid user name and Invalid password " + " Login not Successfull");
	   Thread.sleep(5000);
	   WebElement negativetest = driver.findElement(By.id("error"));
	   String negativetext = negativetest.getText();
	   System.out.println(negativetext);
	   driver.quit();
		

}
  @Test
  public void testCase4() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   
	   Thread.sleep(3000);
	   driver.get("https://www.nepalimatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "nep140549");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), " ");
	   
	   Base.click(i.getLoginbtn());
	   System.out.println(" Valid user name and space password " + " Login not Successfull");
	   Thread.sleep(5000);
	   WebElement negativetest = driver.findElement(By.id("error"));
	   String negativetext = negativetest.getText();
	   System.out.println(negativetext);
	   driver.quit();
		

}

  @Test
  public void testCase5() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   
	   Thread.sleep(3000);
	   driver.get("https://www.nepalimatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "cbstest");
	   
	   Base.click(i.getLoginbtn());
	   System.out.println(" space user name and valid password " + " Login not Successfull");
	   Thread.sleep(5000);
	   WebElement negativetest = driver.findElement(By.id("error"));
	   String negativetext = negativetest.getText();
	   System.out.println(negativetext);
	   driver.quit();
		

}
  

  @Test
  public void testCase6() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   
	   Thread.sleep(3000);
	   driver.get("https://www.nepalimatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "123456789");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "cbstest");
	   
	   Base.click(i.getLoginbtn());
	   System.out.println(" Numeric user name and valid password " + " Login not Successfull");
	   Thread.sleep(5000);
	   WebElement negativetest = driver.findElement(By.id("error"));
	   String negativetext = negativetest.getText();
	   System.out.println(negativetext);
	   driver.quit();
		

}
  @Test
  public void testCase7() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   
	   Thread.sleep(3000);
	   driver.get("https://www.nepalimatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "nep140549");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "123456");
	   
	   Base.click(i.getLoginbtn());
	   System.out.println(" valid user name and onlynumeric password " + " Login not Successfull");
	   Thread.sleep(5000);
	   WebElement negativetest = driver.findElement(By.id("error"));
	   String negativetext = negativetest.getText();
	   System.out.println(negativetext);
	   driver.quit();
		

}
  @Test
  public void testCase8() throws InterruptedException {
		
	   Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   
	   Thread.sleep(3000);
	   driver.get("https://www.nepalimatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "NEP100332");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "cbstest");
	   
	   Base.click(i.getLoginbtn());
	   System.out.println(" Experiy user name and valid password " + " Login not Successfull");
	   Thread.sleep(5000);
	   WebElement negativetest = driver.findElement(By.id("error"));
	   String negativetext = negativetest.getText();
	   System.out.println(negativetext);
	   driver.quit();
		

  }
  @Test
  public void testCase9() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   
	   Thread.sleep(3000);
	   driver.get("https://www.nepalimatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "NEP12601");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "testpass");
	   
	   Base.click(i.getLoginbtn());
	   System.out.println(" less than 9 char and valid password " + " Login not Successfull");
	   Thread.sleep(5000);
	   WebElement negativetest = driver.findElement(By.id("error"));
	   String negativetext = negativetest.getText();
	   System.out.println(negativetext);
	   driver.quit();
	   

		

  }
  }	   
