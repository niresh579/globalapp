package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class communitysettingPOM extends Base {
	
	
	public communitysettingPOM(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	//////////////////Dont shpw profiles already Viewed,contact etc...////////////
	
	
	////Contact Radio Button 
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[1]/input")
	private WebElement matriId;


	public WebElement getMatriId() {
		return matriId;
		
		
	}
	
	@FindBy(xpath="//*[@id='userpop']/div[2]/div/div[3]/div[2]/ul/li[2]/a")
	private WebElement cs;


	public WebElement getcs() {
		return cs;
	}
	}
	

	
	////View Radio Button
	