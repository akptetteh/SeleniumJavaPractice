package com.practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TableDemo {

	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/table-search-filter-demo.html");
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='task-table']"));
		System.out.println("Number of rows:: "+rows.size());
		
		System.out.println("============ROW DATA===================");
		Iterator<WebElement> it =rows.iterator();
		
		while(it.hasNext()) {//Look through rows while there is next element
			String rowText=it.next().getText();//Go to the next element and get text
			System.out.println(rowText);
		}
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='task-table']/thread/tr/th"));
		System.out.println("Number of columns:: "+cols.size());
		
		System.out.println("=================COLUMN DATA=================");
		//Retrieve the elements of cols list
		for(WebElement col: cols) {
			String colText=col.getText();//Get text of each cell.
			System.out.println(colText);
		}
		driver.close();

	}

}
