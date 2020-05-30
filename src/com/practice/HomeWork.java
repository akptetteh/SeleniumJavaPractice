package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HomeWork extends CommonMethods{
	private Object text;
	@BeforeMethod
	public void openBrowserAndNAvigate() {
		setUp();
	}
	@AfterMethod
	public void quitBrowser() {
		
	}
	@Test
	public void validLogin() {
		WebElement username=driver.findElement(By.id("txtUsername"));
		
		//1st Way
		username.sendKeys(ConfigsReader.getProperty("username"));
		
		//2nd Way
		//sendText(username, ConfigsReader.getProperty("username"));
		
		//3rd qT, Using Page Object Model and PageFactory
		LoginPageElements login=new LoginPageElements();
		//sendText(login.username, ConfigsReader.getProperty("username"));
		
		//sendText(login.password, text);
	}
	

}
