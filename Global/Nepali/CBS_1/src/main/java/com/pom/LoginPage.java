package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.pom.Inbox;


public class LoginPage {
	static WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="a12")
	private WebElement matriId;
	public  WebElement getMatriId() { return matriId; }
	
	@FindBy(id="passwordClear1")
	private  WebElement paswwordclr;
	public WebElement getPaswwordclr() {
		return paswwordclr;
	}
	@FindBy(id="password1")
	private  WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private  WebElement loginbtn;
	public  WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	public static void getLogin(WebDriver driver) throws Throwable {
		   LoginPage login=new LoginPage(driver);
		   Base.click(login.getMatriId());
		   Base.typeData(login.getMatriId(), "Nep126010");
		   Thread.sleep(2000);
		   Base.click(login.getPaswwordclr());
		   Base.typeData(login.getPassword(), "testpass");
		   Thread.sleep(3000);
		   Base.click(login.getLoginbtn());
	}
	public static void getLogin(WebDriver driver,String matriID, String password) throws Throwable {
		   LoginPage login=new LoginPage(driver);
		   Base.click(login.getMatriId());
		   Base.typeData(login.getMatriId(), matriID);
		   Thread.sleep(2000);
		   Base.click(login.getPaswwordclr());
		   Base.typeData(login.getPassword(), password);
		   Thread.sleep(3000);
		   Base.click(login.getLoginbtn());
	}

}

