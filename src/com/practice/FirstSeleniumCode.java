package com.practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class FirstSeleniumCode extends BaseClass {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matse\\eclipse-workspace\\SeleniumJavaPractice\\Drivers\\chromedriver.exe");
		
		setUp();
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
