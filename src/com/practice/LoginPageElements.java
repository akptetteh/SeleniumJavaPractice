package com.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LoginPageElements {
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtpassword")
	public WebElement password;
	
	@FindBy(css="input#btnLogin")
	public WebElement Loginbtn;
	
	@FindBy(xpath="//div[@id='divlogo']img")
	public WebElement Logo;
	
	public void LoginPageElememts() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	

}
