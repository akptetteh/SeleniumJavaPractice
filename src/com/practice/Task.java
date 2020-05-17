package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		if (driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed()) {
			System.out.println("Test Passed");
		}
	}
}
