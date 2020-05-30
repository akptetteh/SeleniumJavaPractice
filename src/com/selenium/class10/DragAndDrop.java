package com.selenium.class10;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeDriverService;
	import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

	public class DragAndDrop {

		public static void main(String[] args) throws InterruptedException {
			String url="https://jqueryui.com/droppable/";
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			
			//elements are inside frame, so switch to frame
			driver.switchTo().frame(0);
			WebElement drag=driver.findElement(By.id("draggable"));
			
			
			//locate both elements to drag and drop.
			WebElement drag1=CommonMethods.waitForClickability(drag);
			//WebElement drag2=driver.findElement(By.id("draggable"));
			WebElement drop=driver.findElement(By.id("droppable"));
			
			//Create of object of action class and pass the webdriver in the constructor
			Actions action=new Actions(driver);
			//drag a file and drop it in the source. Longer way
			action.clickAndHold(drag).moveToElement(drop).release().perform();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

			//use dragAndDrop() method to drag and drop element.
			action.dragAndDrop(drag, drop).perform();
			Thread.sleep(5000);
			driver.quit();
			
			
			Thread.sleep(5000);
			driver.quit();

		}

	}



