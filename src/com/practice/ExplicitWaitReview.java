package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitReview {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		driver.manage().window().maximize();
		WebElement startDownloadButton=driver.findElement(By.cssSelector("button[id='downloadButton']"));
		startDownloadButton.click();
		WebElement completeStatus=driver.findElement(By.xpath("//div[text()='complete!']"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='complete!']")));
		WebElement completStatus=driver.findElement(By.xpath("//div[text()='complete!']"));
		String completeStatusText=completeStatus.getText();
		System.out.println(completeStatusText);
		WebElement closeButton=driver.findElement(By.xpath("//button[text()='close!']"));
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();
	}
	
	
	
	
	
	

}
