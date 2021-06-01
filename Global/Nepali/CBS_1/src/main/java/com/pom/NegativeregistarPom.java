package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class NegativeregistarPom extends Base {
	
	
	public NegativeregistarPom(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	//////////////////Dont shpw profiles already Viewed,contact etc...////////////
	
	
	////Contact Radio Button 
	
	@FindBy(xpath="//*[@id=\"home-register\"]/div/div[2]/nav/ul/li[2]/a")
	private WebElement Registar;

	
	@FindBy(xpath="//*[@id=\"hpreg\"]/div/div/div[3]/input[5]")
	private WebElement Registarnow;
	
	
	@FindBy(id="domainName")
	private WebElement domainname;
	
	public WebElement getDomainname() {
		return domainname;
	}



	public WebElement getRegistarnow() {
		return Registarnow;
		
		
	}



	public WebElement getRegistar() {
		return Registar;
		
		
		
	}


	
	}
	

	
	////View Radio Button
	