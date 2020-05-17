package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.syntax.utils.CommonMethods;

public class GoogleTest extends CommonMethods{
	
	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		//wait(5);
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//wait(5);
		
		tearDown();
		
		
	}

}
