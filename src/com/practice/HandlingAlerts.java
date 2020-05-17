package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		WebElement alertButton=driver.findElement(By.id("alert"));
		alertButton.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement timingAlertButton =driver.findElement(By.xpath("//button[text()='Timing Alert']"));
		timingAlertButton.click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		alert.accept();
	}

}
