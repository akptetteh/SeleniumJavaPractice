package com.selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

import com.syntax.utils.BaseClass;

public class ActionClassAmazonDemo1 {

	public static void main(String[] args) {
		WebDriver driver = BaseClass.setUp();
		WebElement account = driver.findElement(By.xpath("//a[@id='nav=link-accountList']"));
		
		//Action action=new Action(driver);
		//action).moveToElement(account).perform();
		
		//Hover the mouse over menu
				WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
				
				if(element.getText().contains("Start")){
					System.out.println("Manu displayed");
					
				}else {
					System.out.println("Menu did not displayed");
				}
			}

		}

		

	
