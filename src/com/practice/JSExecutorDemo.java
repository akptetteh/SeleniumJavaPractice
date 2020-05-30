package com.practice;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class JSExecutorDemo extends BaseClass {
	
public static void main(String[] args) throws InterruptedException {
	
	setUp();//http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
	
	//login to HRMS APPLICATION
	driver.findElement( By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
	driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
	
	WebElement pass=driver.findElement(By.id("txtPassword"));
	pass.sendKeys(ConfigsReader.getProperty("password"));
	
	WebElement loginBtn=driver.findElement(By.className("button"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.findElement(By.className("button")).click();
	
	Thread.sleep(2000);
	//CREATE AN OBJECT OF TAKESCREENSHOT INTERFACE AND CAST THE WEBDRIVER WITH IT
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	//USE GETSCREENSHOTAS() METHOD TO TAKE THE SCREEN(int the constructor pass Type.File
	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	
	//Copy the file from source to another destination
	try {
		FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/pics.png"));
	}catch(IOException e) {
		e.printStackTrace();
		System.out.println("Screenshot was not taken");
	}
	
	//change the background color of an element
	js.executeScript("arguments[0].style.backgroundColor='red'", pass);
	
	//Click on the login button using js
	js.executeScript("arguments[0].click()", loginBtn);
	
	//Scroll down and up in the window
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0, 250)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0, -250)");
	
	Thread.sleep(5000);
		

}

}
