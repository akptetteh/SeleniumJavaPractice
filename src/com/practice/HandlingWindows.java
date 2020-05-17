package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		WebElement newBrowserTabButton=driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
		newBrowserTabButton.click();
		String parentWindow=driver.getWindowHandle();//Getting Parent Window ID
		Thread.sleep(2000);
		driver.close();
		
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> it=allWindows.iterator();
		
		while(it.hasNext()) {
			String childWindow=it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		WebElement header=driver.findElement(By.xpath("//Strong[contains(text(), 'Agile Testing')]"));
		String headerText=header.getText();
		System.out.println(headerText);
	}

}
