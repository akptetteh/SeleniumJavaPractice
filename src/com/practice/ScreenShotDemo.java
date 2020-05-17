package com.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.Constants;

public class ScreenShotDemo extends CommonMethods {
	public static void main(String[] args) {
		 
		setUp("chrome", Constants.HRMS_URL);
		
		//LOGIN INTO HRMS
		String userName="Admin";
		String password="Hum@nhrm123";
		driver.findElement(By.id("txtUserName")).sendKeys(userName);
		driver.findElement(By.id("txtpassword")).sendKeys(password);
		driver.findElement(By.id("txtbtnLogin")).click();
		
		
		//VERIFY EMPLOYEE IS LOGGED IN
		String uid= driver.findElement(By.id("welcome")).getText();
		if(uid.contains(userName)) {
			System.out.println("User "+userName+" is logged in");
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File screen=ts.getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(screen, new File(source,"");
				
			}catch(IOException e) {
				
			}
			
		}
		
	}


}
