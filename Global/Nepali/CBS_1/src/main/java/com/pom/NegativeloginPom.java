package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class NegativeloginPom extends Base {
	
	
	public NegativeloginPom(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	//////////////////Dont shpw profiles already Viewed,contact etc...////////////
	
	
	////Contact Radio Button 
	
	@FindBy(id="error")
	private WebElement errorlogin;


	public WebElement getErrorlogin() {
		return errorlogin;
	}
	
}
	
	////View Radio Button
	