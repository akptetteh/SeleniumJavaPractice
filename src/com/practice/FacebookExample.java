package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		String signUpTitle=driver.getTitle();
		System.out.println("Main Page Title is:: "+signUpTitle);
		String parentWindowHandle=driver.getWindowHandle();//GRAB THE HANDLE OF PARENT WINDOW
		System.out.println("What is the Parent Window Handle? "+parentWindowHandle);
		
		
		driver.findElement(By.linkText("Follow On Istagram")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Like us on Facebook")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Follow Istagram & Facebook")).click();
		Thread.sleep(1000);
		
		Set<String>allWindowHandles=driver.getWindowHandles();//returns set of window handle of all windows
		System.out.println("What is tne number of windows opened? "+allWindowHandles.size());
		
		Iterator<String>it=allWindowHandles.iterator();
		
		while(it.hasNext()) {
			String handle=it.next();//Grap the next Window Handle
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(1000);
			}
		}
		
		
		
	}

}
